// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20210112.models;

import com.aliyun.tea.*;

public class SendFeedbackRequest extends TeaModel {
    @NameInMap("RiskLabel")
    public String riskLabel;

    @NameInMap("SampleType")
    public String sampleType;

    @NameInMap("Value")
    public String value;

    public static SendFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SendFeedbackRequest self = new SendFeedbackRequest();
        return TeaModel.build(map, self);
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
