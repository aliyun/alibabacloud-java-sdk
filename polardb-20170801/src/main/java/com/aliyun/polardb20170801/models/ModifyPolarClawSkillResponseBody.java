// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPolarClawSkillResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The evaluation status.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluateStatus")
    public String evaluateStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The baseline risk details.</p>
     * 
     * <strong>example:</strong>
     * <p>riskDetail</p>
     */
    @NameInMap("RiskDetail")
    public String riskDetail;

    public static ModifyPolarClawSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarClawSkillResponseBody self = new ModifyPolarClawSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPolarClawSkillResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyPolarClawSkillResponseBody setEvaluateStatus(String evaluateStatus) {
        this.evaluateStatus = evaluateStatus;
        return this;
    }
    public String getEvaluateStatus() {
        return this.evaluateStatus;
    }

    public ModifyPolarClawSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPolarClawSkillResponseBody setRiskDetail(String riskDetail) {
        this.riskDetail = riskDetail;
        return this;
    }
    public String getRiskDetail() {
        return this.riskDetail;
    }

}
