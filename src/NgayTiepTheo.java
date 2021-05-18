public class NgayTiepTheo {
    int ngay;
    int thang;
    int nam;

    public String tinhNgayTiepTheo(int ngay, int thang, int nam) {
        if (ngay<=kiemTraThang(thang, nam)){
            if (thang == 12 && ngay == 31) {
                ngay = 1;
                thang = 1;
                nam += 1;
            }else if (ngay==kiemTraThang(thang, nam)){
                ngay=1;
                thang += 1;
            }else {
                ngay+=1;
            }
        }else {
            return "Ngày không hợp lệ!";
        }
        return ngay + ", " + thang + ", " + nam;
    }
    public int kiemTraThang(int thang, int nam) {
        int ngayCuoiThang = 0;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngayCuoiThang = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngayCuoiThang = 30;
                break;
            case 2:
                if (kiemTraNam(nam)) {
                    ngayCuoiThang = 29;
                } else {
                    ngayCuoiThang = 28;
                }
                break;
        }
        return ngayCuoiThang;
    }
    public boolean kiemTraNam(int nam) {
        if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
            return true;
        }
        return false;
    }
}
