/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.TaiKhoan;
import Repository.TaiKhoanRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class XacThucTaiKhoan {
    TaiKhoanRepository accRepo = new TaiKhoanRepository();
    public List<TaiKhoan> layds(){
         try {
            return accRepo.findAll();
        } catch (Exception ex) {
            return null;
        }
    }
    public Integer xacThucTaiKhoan(TaiKhoan accIn){
//        String role ;
        String userInput = accIn.getTaiKhoan();
        TaiKhoan acc = accRepo.getUSer(userInput);
//        System.out.println(acc);
        if(acc != null){
            String passInput = accIn.getMatKhau();
            if(acc.getMatKhau().equals(passInput)){
                if(acc.getMaChucVu() == 1){
                return 1;
                }
                else{
                    return 2;
                }
            }
            else{
                return -1;
            }
        }   
        return 0;
        
    }
}
