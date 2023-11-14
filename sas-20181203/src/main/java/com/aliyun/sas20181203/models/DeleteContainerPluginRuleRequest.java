// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteContainerPluginRuleRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and the response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the rule.</p>
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
