// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetSensitiveDefineRuleConfigRequest extends TeaModel {
    /**
     * <p>The configurations of the custom check rule. The value is in the JSON format. Valid values of keys:</p>
     * <ul>
     * <li><strong>classKey</strong>: the category keyword of the check rule.</li>
     * <li><strong>ruleList</strong>: the keyword of the check rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;classKey\&quot;: \&quot;password\&quot;, \&quot;ruleList\&quot;: [\&quot;huaweicloud_ak\&quot;, \&quot;ak_leak\&quot;]}]</p>
     */
    @NameInMap("Config")
    public String config;

    @NameInMap("EnableNewRule")
    public Integer enableNewRule;

    @NameInMap("Source")
    public String source;

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

    public SetSensitiveDefineRuleConfigRequest setEnableNewRule(Integer enableNewRule) {
        this.enableNewRule = enableNewRule;
        return this;
    }
    public Integer getEnableNewRule() {
        return this.enableNewRule;
    }

    public SetSensitiveDefineRuleConfigRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
