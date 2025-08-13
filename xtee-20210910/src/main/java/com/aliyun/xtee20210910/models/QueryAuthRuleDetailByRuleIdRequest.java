// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class QueryAuthRuleDetailByRuleIdRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Primary key ID of the strategy</p>
     * 
     * <strong>example:</strong>
     * <p>6843</p>
     */
    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Strategy ID</p>
     * 
     * <strong>example:</strong>
     * <p>102224</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>Primary key ID of the strategy version</p>
     * 
     * <strong>example:</strong>
     * <p>11519</p>
     */
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
