package registerEvent;

import register.ProjectRegister;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class ProjectRegisterEvent {

    public void projectRegisterSave(ProjectRegister projectRegister) throws IOException {

        File file = new File("projectRegister.txt");
        OutputStream outputStream = new FileOutputStream(file, true);
        Scanner scanner = new Scanner(new File("projectRegister.txt"));
        String txt[], id = "", qua = "";
        boolean stop = true;
        int counter = 0;

            while (scanner.hasNext()) {
                txt = scanner.nextLine().split(",");
                id = txt[4];
                qua = txt[5];
                if (id.equalsIgnoreCase(projectRegister.tfAdvisorID.getText())) {
                    counter++;
                }
                if (qua.equalsIgnoreCase(projectRegister.cbQualification.getValue() + "") &&
                        id.equalsIgnoreCase(projectRegister.tfAdvisorID.getText())) {
                    if ((projectRegister.cbQualification.getValue() + "").equalsIgnoreCase("graduate assistant")) {
                        stop = false;
                        break;
                    } else if ((projectRegister.cbQualification.getValue() + "").equalsIgnoreCase("lecture") && counter == 2) {
                        stop = false;
                        break;
                    } else if (((projectRegister.cbQualification.getValue() + "").equalsIgnoreCase("assistant professor") && counter == 3)) {
                        stop = false;
                        break;
                    }
                }

            }
        if (stop && !projectRegister.tfTitle.getText().isEmpty() && !projectRegister.tfDescription.getText().isEmpty() &&
                !projectRegister.tfFieldOfStudy.getText().isEmpty() && !projectRegister.tfAdvisorName.getText().isEmpty() &&
                !projectRegister.tfAdvisorID.getText().isEmpty() && !projectRegister.tfSpecialization.getText().isEmpty() &&
                !projectRegister.tfGroupID.getText().isEmpty()) {

            outputStream.write((projectRegister.tfTitle.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfDescription.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfFieldOfStudy.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfAdvisorName.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfAdvisorID.getText() + ",").getBytes());
            outputStream.write((projectRegister.cbQualification.getValue() + ",").getBytes());
            outputStream.write((projectRegister.tfSpecialization.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfGroupID.getText() + "\n").getBytes());
            projectRegister.stage.close();
            outputStream.close();

        }
    }


    public void projectRegisterEvent() {
        ProjectRegister projectRegister = new ProjectRegister();
        projectRegister.projectRegister();
    }

}
                                                                                                                                                          package registerEvent;

import register.ProjectRegister;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class ProjectRegisterEvent {

    public void projectRegisterSave(ProjectRegister projectRegister) throws IOException {

        File file = new File("projectRegister.txt");
        OutputStream outputStream = new FileOutputStream(file, true);
        Scanner scanner = new Scanner(new File("projectRegister.txt"));
        String txt[], id = "", qua = "";
        boolean stop = true;
        int counter = 0;

            while (scanner.hasNext()) {
                txt = scanner.nextLine().split(",");
                id = txt[4];
                qua = txt[5];
                if (id.equalsIgnoreCase(projectRegister.tfAdvisorID.getText())) {
                    counter++;
                }
                if (qua.equalsIgnoreCase(projectRegister.cbQualification.getValue() + "") &&
                        id.equalsIgnoreCase(projectRegister.tfAdvisorID.getText())) {
                    if ((projectRegister.cbQualification.getValue() + "").equalsIgnoreCase("graduate assistant")) {
                        stop = false;
                        break;
                    } else if ((projectRegister.cbQualification.getValue() + "").equalsIgnoreCase("lecture") && counter == 2) {
                        stop = false;
                        break;
                    } else if (((projectRegister.cbQualification.getValue() + "").equalsIgnoreCase("assistant professor") && counter == 3)) {
                        stop = false;
                        break;
                    }
                }

            }
        if (stop && !projectRegister.tfTitle.getText().isEmpty() && !projectRegister.tfDescription.getText().isEmpty() &&
                !projectRegister.tfFieldOfStudy.getText().isEmpty() && !projectRegister.tfAdvisorName.getText().isEmpty() &&
                !projectRegister.tfAdvisorID.getText().isEmpty() && !projectRegister.tfSpecialization.getText().isEmpty() &&
                !projectRegister.tfGroupID.getText().isEmpty()) {

            outputStream.write((projectRegister.tfTitle.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfDescription.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfFieldOfStudy.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfAdvisorName.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfAdvisorID.getText() + ",").getBytes());
            outputStream.write((projectRegister.cbQualification.getValue() + ",").getBytes());
            outputStream.write((projectRegister.tfSpecialization.getText() + ",").getBytes());
            outputStream.write((projectRegister.tfGroupID.getText() + "\n").getBytes());
            projectRegister.stage.close();
            outputStream.close();

        }
    }


    public void projectRegisterEvent() {
        ProjectRegister projectRegister = new ProjectRegister();
        projectRegister.projectRegister();
    }

}
