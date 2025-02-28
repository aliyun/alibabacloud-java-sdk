// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobDiagnosis extends TeaModel {
    @NameInMap("diagnoseId")
    public String diagnoseId;

    @NameInMap("diagnoseTime")
    public Long diagnoseTime;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("riskLevel")
    public String riskLevel;

    @NameInMap("symptoms")
    public JobDiagnosisSymptoms symptoms;

    @NameInMap("workspace")
    public String workspace;

    public static JobDiagnosis build(java.util.Map<String, ?> map) throws Exception {
        JobDiagnosis self = new JobDiagnosis();
        return TeaModel.build(map, self);
    }

    public JobDiagnosis setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public JobDiagnosis setDiagnoseTime(Long diagnoseTime) {
        this.diagnoseTime = diagnoseTime;
        return this;
    }
    public Long getDiagnoseTime() {
        return this.diagnoseTime;
    }

    public JobDiagnosis setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public JobDiagnosis setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public JobDiagnosis setSymptoms(JobDiagnosisSymptoms symptoms) {
        this.symptoms = symptoms;
        return this;
    }
    public JobDiagnosisSymptoms getSymptoms() {
        return this.symptoms;
    }

    public JobDiagnosis setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
