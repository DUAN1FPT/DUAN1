/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Hoa;
import Repository.HoaRepository;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class HoaService {

    private final HoaRepository hoaRepo = new HoaRepository();

    public List<Hoa> layDsHoa() {

        try {
            return hoaRepo.getAll();
        } catch (Exception ex) {
            return null; // loi
        }
    }

    public Integer xoaHoa(Integer maHoa) {
        try {
            return hoaRepo.xoa(maHoa);
        } catch (Exception ex) {
            return -1; // thất bại  
        }
    }

    public Integer themHoa(Hoa hoa) {
        try {
            return hoaRepo.themHoa(hoa);
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1; // thất bại

        }
    }

    public Integer capNhatHoa(Hoa hoa) {
        try {
            return hoaRepo.capNhatHoa(hoa);
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1; // thất bại

        }
    }

    public List<Hoa> timKiem(String tenHoa) {
        try {
            return hoaRepo.timKiem(tenHoa);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null; // thất bại

        }
    }
}
