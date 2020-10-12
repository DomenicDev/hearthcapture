package de.cassisi.heart.port;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
class TimeData implements Comparable<TimeData> {

    // TIMESTAMP
    private final LocalDateTime timestamp;

    // ----------------------------
    // HLM PARAM DATA
    private Double artFlow;
    private Double flow2;
    private Double flow3;

    private Double pressure1;
    private Double pressure2;

    private Double temp1;
    private Double temp2;
    private Double temp3;

    private Double plegieflowA;
    private Double plegieflowB;
    private Double plegiedruck;
    private Double gasmixflow;
    private Double gasfio2;

    private Double bgtempVen;
    private Double o2satVen;
    private Double hct;
    private Integer pathfreq;
    private Double pattemp1;
    private Integer patartdruck;
    private Integer patpuldruck;
    private Integer patzvdruck;

    private Double ci;
    private Double flowRel;
    private Double svr;
    private Double gasBlood;
    private Double narkosegas;
    // ----------------------------

    // --------------------------------
    // BLOOD SAMPLES
    private BloodSampleData bloodDataArt = new BloodSampleData();
    private BloodSampleData bloodDataVen = new BloodSampleData();

    //-----------------------------------

    // EVENTS
    private String bypass;
    private String aorta;
    private String reperfusion;
    private String levelstand;
    private Integer kardioplegie;
    private Integer jonosteril;
    private Integer heparin;
    private Integer nabi_8_4;
    private String cs_ek;
    private String fremdblut;
    private String humanalbumin_5pc;
    private String humanalbumin_20pc;
    private String haemofiltrat;
    private Integer restblut_perf;
    private Integer maschinenblut;
    private String cell_saver_abgesaugt;
    private String defibrillation;
    private Integer act;
    private String haemofiltration;
    private String cytokin_adsorption;

    // ------------------------------

    // NIRS DATA
    private Double leftSaturation;
    private Double rightSaturation;


    // BIS
    private Double depthOfAnesthesia;


    // PERFUSORS
    private Integer perfusorArterenol;
    private Integer perfusorVasopressin;
    private Integer perfusorSufentanil;

    //------------------------------------------

    // UNKNOWN
    private Double kod;
    private String do2;

    

    TimeData(@NonNull LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int compareTo(TimeData o) {
        return timestamp.compareTo(o.timestamp);
    }
}
