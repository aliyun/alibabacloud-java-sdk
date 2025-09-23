// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20210112.models;

import com.aliyun.tea.*;

public class RevokeFeedbackRequest extends TeaModel {
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

    public static RevokeFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeFeedbackRequest self = new RevokeFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public RevokeFeedbackRequest setSampleType(String sampleType) {
        this.sampleType = sampleType;
        return this;
    }
    public String getSampleType() {
        return this.sampleType;
    }

    public RevokeFeedbackRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
