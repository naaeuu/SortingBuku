import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BookSearchGUI extends JFrame {
    private BookService service;

    private JTextField txtSearch;
    private JComboBox<String> cmbGenre;
    private JTextArea txtResult;

    public BookSearchGUI() {
        try {
            // Load data
            LinkedList<Book> books = BookDAO.loadBooksFromJSON("books.json");
            service = new BookService(books);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error membaca file JSON: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        setTitle("Pencarian Buku");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        // Panel input
        JPanel panelInput = new JPanel(new GridLayout(1, 3, 5, 5));

        txtSearch = new JTextField();
        JButton btnSearch = new JButton("Cari Judul");
        cmbGenre = new JComboBox<>();
        JButton btnFilterGenre = new JButton("Filter Genre");

        // Isi dropdown genre
        cmbGenre.addItem("Fiction");
        cmbGenre.addItem("Juvenile Fiction");
        cmbGenre.addItem("Computers");
        cmbGenre.addItem("Travel");
        cmbGenre.addItem("Art");
        cmbGenre.addItem("Cooking");
        cmbGenre.addItem("All");

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyword = txtSearch.getText();
                List<Book> results = service.searchByTitle(keyword);
                displayResults(results);
            }
        });

        btnFilterGenre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String genre = (String) cmbGenre.getSelectedItem();
                if ("All".equals(genre)) {
                    displayResults(service.getAllBooks());
                } else {
                    List<Book> results = service.filterByGenre(genre);
                    displayResults(results);
                }
            }
        });

        panelInput.add(txtSearch);
        panelInput.add(btnSearch);
        panelInput.add(cmbGenre);
        panelInput.add(btnFilterGenre);

        // Area hasil
        txtResult = new JTextArea();
        txtResult.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtResult);

        add(panelInput, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void displayResults(List<Book> books) {
        txtResult.setText("");
        if (books.isEmpty()) {
            txtResult.setText("Tidak ada hasil ditemukan.");
            return;
        }

        for (Book book : books) {
            txtResult.append("Judul: " + book.getTitle() + "\n");
            txtResult.append("Penulis: " + book.getAuthors() + "\n");
            txtResult.append("Genre: " + book.getGenre() + "\n");
            txtResult.append("----------------------------------------\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BookSearchGUI().setVisible(true);
        });
    }
}