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

    /**
     * <p>Specifies whether to enable the new ruled for automatic check only on agentless detection. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no.</li>
     * <li><strong>1</strong>: yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableNewRule")
    public Integer enableNewRule;

    /**
     * <p>The source of the check rules. Valid values:</p>
     * <ul>
     * <li><strong>image</strong>: image.</li>
     * <li><strong>agentless</strong>: agentless detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
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
