// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetBuildRiskDefineRuleConfigRequest extends TeaModel {
    /**
     * <p>The configuration item for scanning image build command risks. Valid values:</p>
     * <ul>
     * <li><strong>classKey</strong>: Set the value to a valid value of the ClassKey parameter in RuleTree.</li>
     * <li><strong>ruleList</strong>: Set the value to a valid value of the RuleKey parameter in RuleList.</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="~~GetBuildRiskDefineRuleConfig~~">GetBuildRiskDefineRuleConfig</a> operation to query the valid values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;classKey&quot;: &quot;other&quot;,
     *         &quot;ruleList&quot;: [
     *             &quot;add&quot;,
     *             &quot;apk&quot;
     *         ]
     *     }
     * ]</p>
     */
    @NameInMap("Config")
    public String config;

    public static SetBuildRiskDefineRuleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBuildRiskDefineRuleConfigRequest self = new SetBuildRiskDefineRuleConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetBuildRiskDefineRuleConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
