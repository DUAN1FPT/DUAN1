/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Mau;
import Model.NhaCungCap;
import Repository.MauRepository;
import Repository.NhaCungCapRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhaCungCapService {
    private final NhaCungCapRepository nhaccRepo = new NhaCungCapRepository();
    public List<NhaCungCap> layDs(){
        try {
            return nhaccRepo.getAll();
        } catch (Exception e) {
            return null;
        }
    }
}
