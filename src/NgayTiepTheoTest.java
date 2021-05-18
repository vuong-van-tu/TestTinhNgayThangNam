class NgayTiepTheoTest {

    @org.junit.jupiter.api.Test
    void tinhNgayTiepTheo() {
        NgayTiepTheo ab = new NgayTiepTheo();
        System.out.println(ab.tinhNgayTiepTheo(33,4,2000));
    }

    @org.junit.jupiter.api.Test
    void kiemTraThang() {
        NgayTiepTheo abcd = new NgayTiepTheo();
        System.out.println(abcd.kiemTraThang(2,1999));
    }

    @org.junit.jupiter.api.Test
    void kiemTraNam() {
        int nam = 1999;
        NgayTiepTheo abc = new NgayTiepTheo();
        System.out.println(abc.kiemTraNam(nam));

    }
}