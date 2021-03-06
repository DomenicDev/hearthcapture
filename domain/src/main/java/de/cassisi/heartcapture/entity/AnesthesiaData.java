package de.cassisi.heartcapture.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDateTime;

/**
 * This class represents an immutable sample of anesthesia data.
 * This data could be generated by a BIS device, for example.
 */
@Getter
@AllArgsConstructor
public final class AnesthesiaData {

    @NonNull private final LocalDateTime timestamp;
    private final double depthOfAnesthesia;

}
