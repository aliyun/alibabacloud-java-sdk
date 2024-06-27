// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDecisionResultFluctuationRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("regId")
    public String regId;

    public static DescribeDecisionResultFluctuationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDecisionResultFluctuationRequest self = new DescribeDecisionResultFluctuationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDecisionResultFluctuationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDecisionResultFluctuationRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeDecisionResultFluctuationRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
