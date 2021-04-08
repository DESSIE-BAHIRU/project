package registerEvent;

import register.GroupRegister;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class GroupRegisterEvent {
    public void groupRegister(GroupRegister groupRegister) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("GroupRegister.txt", true);
        Scanner scanner = new Scanner(new File("GroupRegister.txt"));
        boolean id = true;
            String[] txt;
            while (scanner.hasNext()) {
                txt = scanner.nextLine().split(",");
                if (txt[2].equalsIgnoreCase(groupRegister.tfStudentId1.getText()) ||
                        txt[2].equalsIgnoreCase(groupRegister.tfStudentId2.getText()) ||
                        txt[2].equalsIgnoreCase(groupRegister.tfStudentId3.getText())) {
                    id = false;
                    break;
                }
                if (txt[3].equalsIgnoreCase(groupRegister.tfStudentId1.getText()) ||
                        txt[3].equalsIgnoreCase(groupRegister.tfStudentId2.getText()) ||
                        txt[3].equalsIgnoreCase(groupRegister.tfStudentId3.getText())) {
                    id = false;
                    break;
                }
                if (txt[4].equalsIgnoreCase(groupRegister.tfStudentId1.getText()) ||
                        txt[4].equalsIgnoreCase(groupRegister.tfStudentId2.getText()) ||
                        txt[4].equalsIgnoreCase(groupRegister.tfStudentId3.getText())) {
                    id = false;
                    break;
                }
            }

        if (id && !groupRegister.tfGroupName.getText().equals("") &&
                !groupRegister.tfGroupID.getText().equals("") &&
                (!(groupRegister.tfStudentId1.getText().equals("")) ||
                        !(groupRegister.tfStudentId2.getText().equals("")) ||
                        !(groupRegister.tfStudentId3.getText().equals(""))
                )) {
            fileOutputStream.write((groupRegister.tfGroupID.getText() + ",").getBytes());
            fileOutputStream.write((groupRegister.tfGroupName.getText() + ",").getBytes());
            if (!(groupRegister.tfStudentId1.getText().equals(""))) {
                fileOutputStream.write((groupRegister.tfStudentId1.getText() + ",").getBytes());
            } else {
                fileOutputStream.write((null + ",").getBytes());
            }
            if (!(groupRegister.tfStudentId2.getText().equals(""))) {
                fileOutputStream.write((groupRegister.tfStudentId2.getText() + ",").getBytes());
            } else {
                fileOutputStream.write((null + ",").getBytes());
            }
            if (!(groupRegister.tfStudentId3.getText().equals(""))) {
                fileOutputStream.write((groupRegister.tfStpackage registerEvent;

import register.GroupRegister;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class GroupRegisterEvent {
    public void groupRegister(GroupRegister groupRegister) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("GroupRegister.txt", true);
        Scanner scanner = new Scanner(new File("GroupRegister.txt"));
        boolean id = true;
            String[] txt;
            while (scanner.hasNext()) {
                txt = scanner.nextLine().split(",");
                if (txt[2].equalsIgnoreCase(groupRegister.tfStudentId1.getText()) ||
                        txt[2].equalsIgnoreCase(groupRegister.tfStudentId2.getText()) ||
                        txt[2].equalsIgnoreCase(groupRegister.tfStudentId3.getText())) {
                    id = false;
                    break;
                }
                if (txt[3].equalsIgnoreCase(groupRegister.tfStudentId1.getText()) ||
                        txt[3].equalsIgnoreCase(groupRegister.tfStudentId2.getText()) ||
                        txt[3].equalsIgnoreCase(groupRegister.tfStudentId3.getText())) {
                    id = false;
                    break;
                }
                if (txt[4].equalsIgnoreCase(groupRegister.tfStudentId1.getText()) ||
                        txt[4].equalsIgnoreCase(groupRegister.tfStudentId2.getText()) ||
                        txt[4].equalsIgnoreCase(groupRegister.tfStudentId3.getText())) {
                    id = false;
                    break;
                }
            }

        if (id && !groupRegister.tfGroupName.getText().equals("") &&
                !groupRegister.tfGroupID.getText().equals("") &&
                (!(groupRegister.tfStudentId1.getText().equals("")) ||
                        !(groupRegister.tfStudentId2.getText().equals("")) ||
                        !(groupRegister.tfStudentId3.getText().equals(""))
                )) {
            fileOutputStream.write((groupRegister.tfGroupID.getText() + ",").getBytes());
            fileOutputStream.write((groupRegister.tfGroupName.getText() + ",").getBytes());
            if (!(groupRegister.tfStudentId1.getText().equals(""))) {
                fileOutputStream.write((groupRegister.tfStudentId1.getText() + ",").getBytes());
            } else {
                fileOutputStream.write((null + ",").getBytes());
            }
            if (!(groupRegister.tfStudentId2.getText().equals(""))) {
                fileOutputStream.write((groupRegister.tfStudentId2.getText() + ",").getBytes());
            } else {
                fileOutputStream.write((null + ",").getBytes());
            }
            if (!(groupRegister.tfStudentId3.getText().equals(""))) {
                fileOutputStream.write((groupRegister.tfStudentId3.getText()).getBytes());
            } else {
                fileOutputStream.write((null + "").getBytes());
            }
            fileOutputStream.write("\n".getBytes());
            fileOutputStream.close();
            groupRegister.stage.close();
        }

    }


    public void groupRegisterEvent() {
        GroupRegister groupRegister = new GroupRegister();
        groupRegister.groupRegister();
    }
}
