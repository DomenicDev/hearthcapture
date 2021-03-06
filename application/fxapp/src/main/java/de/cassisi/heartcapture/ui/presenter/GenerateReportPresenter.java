package de.cassisi.heartcapture.ui.presenter;

import javafx.stage.FileChooser;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static de.cassisi.heartcapture.usecase.GenerateReport.OutputData;

@Component
public class GenerateReportPresenter extends UseCasePresenter<OutputData> {

    @Override
    public void runOnUI(OutputData outputData) {
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Excel-File (*.xlsx)", "*.xlsx"));
            File fileToSave = fileChooser.showSaveDialog(null);


            if (fileToSave == null) {
                // user did not select a file, so return
                return;
            }

            // write to file
            FileOutputStream fos = new FileOutputStream(fileToSave);
            fos.write(outputData.reportFile);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
