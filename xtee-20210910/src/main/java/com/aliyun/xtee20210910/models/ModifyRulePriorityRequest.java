// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyRulePriorityRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The primary key ID of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>3581</p>
     */
    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    /**
     * <p>The policy priority. A larger value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("priority")
    public Integer priority;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>101796</p>
     */
    @NameInMap("ruleId")
    public Long ruleId;

    public static ModifyRulePriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRulePriorityRequest self = new ModifyRulePriorityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRulePriorityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyRulePriorityRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public ModifyRulePriorityRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyRulePriorityRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyRulePriorityRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
