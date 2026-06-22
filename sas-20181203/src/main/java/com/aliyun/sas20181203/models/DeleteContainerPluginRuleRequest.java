// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteContainerPluginRuleRequest extends TeaModel {
    /**
     * <p>The language type of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The rule ID. You can call the addContainerWebDefenseRule operation to obtain the rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200022</p>
     */
    @NameInMap("RuleId")
    public Integer ruleId;

    public static DeleteContainerPluginRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerPluginRuleRequest self = new DeleteContainerPluginRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContainerPluginRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteContainerPluginRuleRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

}
