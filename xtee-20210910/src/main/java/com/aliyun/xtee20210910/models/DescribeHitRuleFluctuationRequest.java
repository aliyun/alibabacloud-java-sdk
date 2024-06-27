// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHitRuleFluctuationRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleStatus")
    public String ruleStatus;

    public static DescribeHitRuleFluctuationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHitRuleFluctuationRequest self = new DescribeHitRuleFluctuationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHitRuleFluctuationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeHitRuleFluctuationRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeHitRuleFluctuationRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeHitRuleFluctuationRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

}
