package exo05;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.time.LocalDate;

public class BulkEditing {
    @Data
    class MutablePerson {
        private Integer id;
        private String label;
        private LocalDate birthDate;

        public ImmutablePerson asImmutable() {
            // Rewrite the return statement
            return ImmutablePerson.builder()
                    .id(id)
                    .label(label)
                    .birthDate(birthDate)
                    .build();
        }
    }

    @Value
    @Builder
    public class ImmutablePerson {
        int id;
        String label;
        LocalDate birthDate;
    }
}