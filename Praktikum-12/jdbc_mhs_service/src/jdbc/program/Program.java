/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author 
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(1, "Hana");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        Mahasiswa mhsAdd2 = new Mahasiswa(2, "Nana");
        service.add(mhsAdd2);
        System.out.println("berhasil insert: " + mhsAdd2);
        Mahasiswa mhsAdd3 = new Mahasiswa(3, "Suhay");
        service.add(mhsAdd3);
        System.out.println("berhasil insert: " + mhsAdd3);
        displayAll();

        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        System.out.println("===delete");
        System.out.println("akan di delete :" + service.getById(5));
        service.delete(5);
        displayAll();
    }

    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listmhs = service.getAll();
        for (Mahasiswa mhs : listmhs) {
            System.out.println(mhs);
        }
        System.out.println();
    }
}
