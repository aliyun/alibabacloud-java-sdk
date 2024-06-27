// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class QueryAuthRuleDetailByRuleIdRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleId")
    public String ruleId;

    @NameInMap("ruleVersionId")
    public Long ruleVersionId;

    public static QueryAuthRuleDetailByRuleIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthRuleDetailByRuleIdRequest self = new QueryAuthRuleDetailByRuleIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthRuleDetailByRuleIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryAuthRuleDetailByRuleIdRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public QueryAuthRuleDetailByRuleIdRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public QueryAuthRuleDetailByRuleIdRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public QueryAuthRuleDetailByRuleIdRequest setRuleVersionId(Long ruleVersionId) {
        this.ruleVersionId = ruleVersionId;
        return this;
    }
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

}
