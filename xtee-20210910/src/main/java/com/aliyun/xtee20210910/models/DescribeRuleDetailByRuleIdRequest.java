// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleDetailByRuleIdRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleId")
    public String ruleId;

    @NameInMap("ruleVersionId")
    public Long ruleVersionId;

    public static DescribeRuleDetailByRuleIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleDetailByRuleIdRequest self = new DescribeRuleDetailByRuleIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleDetailByRuleIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRuleDetailByRuleIdRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public DescribeRuleDetailByRuleIdRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeRuleDetailByRuleIdRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeRuleDetailByRuleIdRequest setRuleVersionId(Long ruleVersionId) {
        this.ruleVersionId = ruleVersionId;
        return this;
    }
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

}
