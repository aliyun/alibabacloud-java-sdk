// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHasRuleNameByEventCodeRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("excludeRuleId")
    public String excludeRuleId;

    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleName")
    public String ruleName;

    public static DescribeHasRuleNameByEventCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHasRuleNameByEventCodeRequest self = new DescribeHasRuleNameByEventCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHasRuleNameByEventCodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeHasRuleNameByEventCodeRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeHasRuleNameByEventCodeRequest setExcludeRuleId(String excludeRuleId) {
        this.excludeRuleId = excludeRuleId;
        return this;
    }
    public String getExcludeRuleId() {
        return this.excludeRuleId;
    }

    public DescribeHasRuleNameByEventCodeRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeHasRuleNameByEventCodeRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
