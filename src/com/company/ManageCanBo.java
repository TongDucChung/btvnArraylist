package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ManageCanBo {
    static ArrayList<CanBo> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addCongNhan() {
        System.out.println("Nhap Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Nhap Gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap Bac: ");
        String Bac = sc.nextLine();
        System.out.println("Nhap Nganh: ");
        String Nganh = sc.nextLine();
        list.add(new CongNhan(hoTen, namSinh, gioiTinh, diaChi, Bac, Nganh));
    }

    public static void addKySu() {
        System.out.println("Nhap Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Nhap Gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap Nganh: ");
        String Nganh = sc.nextLine();
        list.add(new KySu(hoTen, namSinh, gioiTinh, diaChi, Nganh));
    }

    public static void addNhanVien() {
        System.out.println("Nhap Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Nhap Gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String diaChi = sc.nextLine();
        list.add(new NhanVien(hoTen, namSinh, gioiTinh, diaChi));
    }
    public static void fillCanBo() {
        System.out.println("Nhap ten: ");
        String hoTen = sc.nextLine();
        int index = list.indexOf(hoTen);
        if (index < 0) {
            System.out.println("Khong co ket qua!");
        } else {
            System.out.println(list.get(index));
        }
    }

    public static void xoaNhanVien() {
        System.out.println("Nhap ten: ");
        String hoTen = sc.nextLine();
        for (CanBo nhanVien: list) {
            if (nhanVien instanceof NhanVien && nhanVien.getHoTen().equals(hoTen)) {
                list.remove(nhanVien);
            }
        }
    }

    public static void suaCanBo() {
        System.out.println("Nhap ten: ");
        String hoTenOld = sc.nextLine();
        System.out.println("----Thong tin moi----");
        System.out.println("Nhap Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Nhap Gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String diaChi = sc.nextLine();
        NhanVien nhanVien = new NhanVien(hoTen, namSinh, gioiTinh, diaChi);
        int index = list.indexOf(hoTenOld);
        list.set(index, nhanVien);
    }

    public static void show() {
        for (CanBo element: list) {
            System.out.println(element);;
        }
    }

    public static void timKiemNganh() {
        System.out.println("Nhap nganh: ");
        String Nganh = sc.nextLine();
        for (CanBo element: list) {
            if (element instanceof CongNhan) {
                if (((CongNhan) element).getNganh().equals(Nganh)) {
                    System.out.println(element);;
                }
            } else if (element instanceof KySu) {
                if (((KySu) element).getNganh().equals(Nganh)) {
                    System.out.println(element);;
                }
            }
        }
//        public void sort() {
//            SortCanBo sortCanBo = new SortCanBo();
//            list.sort(sortCanBo);
//        }

    }


}