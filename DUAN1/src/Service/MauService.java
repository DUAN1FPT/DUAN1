/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Mau;
import Repository.MauRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MauService {
    private final MauRepository mauRepo = new MauRepository();
    public List<Mau> layDs(){
        try {
            return mauRepo.getAll();
        } catch (Exception e) {
            return null;
        }
    }
}
