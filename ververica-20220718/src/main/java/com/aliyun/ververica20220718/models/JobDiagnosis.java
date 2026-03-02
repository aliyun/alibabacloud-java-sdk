// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobDiagnosis extends TeaModel {
    /**
     * <p>The diagnostic task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ba30cd99-37a5-4a20-8cd9-ed4b*****</p>
     */
    @NameInMap("diagnoseId")
    public String diagnoseId;

    /**
     * <p>The time when the deployment is diagnosed.</p>
     * 
     * <strong>example:</strong>
     * <p>1740389560871</p>
     */
    @NameInMap("diagnoseTime")
    public Long diagnoseTime;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default-namespace-*****</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The severity level of the risk.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RISK_LEVEL_HIGH</li>
     * <li>RISK_LEVEL_MID</li>
     * <li>RISK_LEVEL_LOW</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RISK_LEVEL_LOW</p>
     */
    @NameInMap("riskLevel")
    public String riskLevel;

    /**
     * <p>The diagnostic details.</p>
     */
    @NameInMap("symptoms")
    public JobDiagnosisSymptoms symptoms;

    /**
     * <p>The workspace to which the deployment belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>a14bd5d90a****</p>
     */
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
