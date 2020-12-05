package sample;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class mycontoller {


    public Pane addpane;
    public Pane viewpane;
    public Pane welcomepane;
    public Pane peopleaddpane;
    public Pane governmentalcarsaddpane;
    public Pane publiccarsaddpane;
    public Pane privatecarsaddpane;
    public Pane workshopsaddpane;
    public Pane cargalleriesaddpane;
    public Pane inspectioncentersaddpane;
    public Pane drivingschoolsaddpane;
    public Pane taxiofficeaddpane;
    public StackPane stackpaneadd;

    public void addbtnmouseclicked(MouseEvent mouseEvent) {
        viewpane.setVisible(false);
        welcomepane.setVisible(false);
        addpane.setVisible(true);
            stackpaneadd.setVisible(true);
                governmentalcarsaddpane.setVisible(false);
                cargalleriesaddpane.setVisible(false);
                drivingschoolsaddpane.setVisible(false);
                inspectioncentersaddpane.setVisible(false);
                peopleaddpane.setVisible(true);
                privatecarsaddpane.setVisible(false);
                publiccarsaddpane.setVisible(false);
                workshopsaddpane.setVisible(false);
                taxiofficeaddpane.setVisible(false);

    }

    public void viewbtnmouseclicked(MouseEvent mouseEvent) {
        addpane.setVisible(false);
        viewpane.setVisible(false);
        welcomepane.setVisible(false);

    }

    public void dvlmouseclicked(MouseEvent mouseEvent) {
        addpane.setVisible(false);
        viewpane.setVisible(false);
        welcomepane.setVisible(true);

    }

    public void peopleaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(true);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }

    public void galleriesaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(true);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);

    }

    public void privateaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(true);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);

    }

    public void goveaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(true);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }

    public void publicaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(true);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }

    public void taxiaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(true);
    }

    public void workshopaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(true);
        taxiofficeaddpane.setVisible(false);
    }

    public void schoolsaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(true);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }

    public void inspectionaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(true);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }
}
