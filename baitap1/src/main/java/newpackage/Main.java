public static void main(String[] args) {
    List<Book> listBook = new ArrayList<>();
    Scanner x = new Scanner(System.in);

    String msg = """
            Chuong trinh quan ly sach
            1. Them 1 cuon sach
            2. Xoa 1 cuon sach
            3. Thay doi sach
            4. Xuat thong tin
            5. Tim sach lap trinh
            6. Lay sach toi da theo gia
            7. Tim kiem theo tac gia
            0. Thoat
            Chon chuc nang:
            """;

    int chon = 0;
    do {
        System.out.print(msg);
        chon = x.nextInt();

        switch (chon) {
            case 1 -> {
                Book newBook = new Book();
                newBook.input();
                listBook.add(newBook);
            }
            case 2 -> {
                System.out.print("Nhap vao ma sach can xoa: ");
                int bookid = x.nextInt();

                Book find = listBook.stream()
                        .filter(p -> p.getId() == bookid)
                        .findFirst()
                        .orElseThrow();

                listBook.remove(find);
                System.out.println("Da xoa sach thanh cong");
            }
            case 3 -> {
                System.out.print("Nhap vao ma sach can dieu chinh: ");
                int bookid = x.nextInt();

                Book find = listBook.stream()
                        .filter(p -> p.getId() == bookid)
                        .findFirst()
                        .orElseThrow();

                find.input(); // cap nhat lai thong tin sach
            }
            case 4 -> {
                System.out.println("\nXuat thong tin danh sach");
                listBook.forEach(Book::output);
            }
            case 5 -> {
                List<Book> list5 = listBook.stream()
                        .filter(u -> u.getTitle().toLowerCase().contains("lap trinh"))
                        .toList();

                list5.forEach(Book::output);
            }
        }
    } while (chon != 0);
}
