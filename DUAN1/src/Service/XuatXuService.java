/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

//import Model.Mau;
import Model.XuatXu;
//import Repository.MauRepository;
import Repository.XuatXuRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class XuatXuService {
      private final XuatXuRepository xuatXuRepo = new XuatXuRepository();
    public List<XuatXu> layDs(){
        try {
            return xuatXuRepo.getAll();
        } catch (Exception e) {
            return null;
        }
    }
}
