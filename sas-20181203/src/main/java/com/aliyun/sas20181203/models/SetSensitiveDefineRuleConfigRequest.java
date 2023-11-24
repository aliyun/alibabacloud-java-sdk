// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetSensitiveDefineRuleConfigRequest extends TeaModel {
    /**
     * <p>The configurations of the custom check rule. The value is in the JSON format. Valid values of keys:</p>
     * <br>
     * <p>*   **classKey**: the category keyword of the check rule.</p>
     * <p>*   **ruleList**: the keyword of the check rule.</p>
     */
    @NameInMap("Config")
    public String config;

    public static SetSensitiveDefineRuleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSensitiveDefineRuleConfigRequest self = new SetSensitiveDefineRuleConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetSensitiveDefineRuleConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
