/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KichThuoc;
import Model.Mau;
import Repository.KichThuocRepository;
import Repository.MauRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KichThuocService {
   private final KichThuocRepository ktRepo = new KichThuocRepository();
    public List<KichThuoc> layDs(){
        try {
            return ktRepo.getAll();
        } catch (Exception e) {
            return null;
        }
    }
}
