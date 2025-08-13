// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteRuleRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Policy primary key ID</p>
     * 
     * <strong>example:</strong>
     * <p>7035</p>
     */
    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>102059</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>Policy version primary key ID</p>
     * 
     * <strong>example:</strong>
     * <p>10203</p>
     */
    @NameInMap("ruleVersionId")
    public Long ruleVersionId;

    public static DeleteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleRequest self = new DeleteRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteRuleRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public DeleteRuleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DeleteRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DeleteRuleRequest setRuleVersionId(Long ruleVersionId) {
        this.ruleVersionId = ruleVersionId;
        return this;
    }
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

}
