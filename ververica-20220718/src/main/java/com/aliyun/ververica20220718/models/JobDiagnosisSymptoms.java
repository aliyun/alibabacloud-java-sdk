// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobDiagnosisSymptoms extends TeaModel {
    @NameInMap("autopilot")
    public JobDiagnosisSymptom autopilot;

    @NameInMap("others")
    public java.util.List<JobDiagnosisSymptom> others;

    @NameInMap("runtime")
    public java.util.List<JobDiagnosisSymptom> runtime;

    @NameInMap("startup")
    public java.util.List<JobDiagnosisSymptom> startup;

    @NameInMap("state")
    public java.util.List<JobDiagnosisSymptom> state;

    @NameInMap("troubleshooting")
    public java.util.List<JobDiagnosisSymptom> troubleshooting;

    public static JobDiagnosisSymptoms build(java.util.Map<String, ?> map) throws Exception {
        JobDiagnosisSymptoms self = new JobDiagnosisSymptoms();
        return TeaModel.build(map, self);
    }

    public JobDiagnosisSymptoms setAutopilot(JobDiagnosisSymptom autopilot) {
        this.autopilot = autopilot;
        return this;
    }
    public JobDiagnosisSymptom getAutopilot() {
        return this.autopilot;
    }

    public JobDiagnosisSymptoms setOthers(java.util.List<JobDiagnosisSymptom> others) {
        this.others = others;
        return this;
    }
    public java.util.List<JobDiagnosisSymptom> getOthers() {
        return this.others;
    }

    public JobDiagnosisSymptoms setRuntime(java.util.List<JobDiagnosisSymptom> runtime) {
        this.runtime = runtime;
        return this;
    }
    public java.util.List<JobDiagnosisSymptom> getRuntime() {
        return this.runtime;
    }

    public JobDiagnosisSymptoms setStartup(java.util.List<JobDiagnosisSymptom> startup) {
        this.startup = startup;
        return this;
    }
    public java.util.List<JobDiagnosisSymptom> getStartup() {
        return this.startup;
    }

    public JobDiagnosisSymptoms setState(java.util.List<JobDiagnosisSymptom> state) {
        this.state = state;
        return this;
    }
    public java.util.List<JobDiagnosisSymptom> getState() {
        return this.state;
    }

    public JobDiagnosisSymptoms setTroubleshooting(java.util.List<JobDiagnosisSymptom> troubleshooting) {
        this.troubleshooting = troubleshooting;
        return this;
    }
    public java.util.List<JobDiagnosisSymptom> getTroubleshooting() {
        return this.troubleshooting;
    }

}
