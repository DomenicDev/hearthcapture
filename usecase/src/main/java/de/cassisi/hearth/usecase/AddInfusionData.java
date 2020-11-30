package de.cassisi.hearth.usecase;

import de.cassisi.hearth.usecase.exception.InputValidationException;
import de.cassisi.hearth.usecase.exception.OperationLockException;
import de.cassisi.hearth.usecase.exception.OperationNotFoundException;
import de.cassisi.hearth.usecase.output.OutputHandler;
import de.cassisi.hearth.usecase.template.UseCaseTemplate;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static de.cassisi.hearth.usecase.AddInfusionData.*;

public interface AddInfusionData extends UseCaseTemplate<InputData, OutputData> {


    class InputData {
        public long operationId;
        public LocalDateTime timestamp;
        public List<PerfusorInput> infusionData = new ArrayList<>();

        public static class PerfusorInput {
            public String name;
            public double rate;

            public PerfusorInput() {
            }
            public PerfusorInput(String name, double rate) {
                this.name = name;
                this.rate = rate;
            }
        }
    }

    class OutputData {

        public List<PerfusorData> data = new ArrayList<>();

        public static class PerfusorData {
            public String name;
            public double rate;

            public PerfusorData(String name, double rate) {
                this.name = name;
                this.rate = rate;
            }
        }

    }

    @Override
    void execute(@NonNull InputData input, @NonNull OutputHandler<OutputData> outputHandler) throws
            InputValidationException,
            OperationNotFoundException,
            OperationLockException;
}
