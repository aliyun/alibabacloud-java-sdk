// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20210112.models;

import com.aliyun.tea.*;

public class SendFeedbackRequest extends TeaModel {
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>Sample labels. User-defined, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>OTHERS</p>
     */
    @NameInMap("RiskLabel")
    public String riskLabel;

    /**
     * <p>Sample type. For phone number type samples, input PHONE; for email type samples, input EMAIL; for account type samples, input ACCOUNT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PHONE</p>
     */
    @NameInMap("SampleType")
    public String sampleType;

    /**
     * <p>Sample value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000000000</p>
     */
    @NameInMap("Value")
    public String value;

    public static SendFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SendFeedbackRequest self = new SendFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public SendFeedbackRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SendFeedbackRequest setRiskLabel(String riskLabel) {
        this.riskLabel = riskLabel;
        return this;
    }
    public String getRiskLabel() {
        return this.riskLabel;
    }

    public SendFeedbackRequest setSampleType(String sampleType) {
        this.sampleType = sampleType;
        return this;
    }
    public String getSampleType() {
        return this.sampleType;
    }

    public SendFeedbackRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
