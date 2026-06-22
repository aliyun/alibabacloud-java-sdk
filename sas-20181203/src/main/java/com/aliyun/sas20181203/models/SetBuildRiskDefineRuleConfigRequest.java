// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetBuildRiskDefineRuleConfigRequest extends TeaModel {
    /**
     * <p>The risk items in the risk scan configuration for image build instructions. Valid values:</p>
     * <ul>
     * <li><strong>classKey</strong>: the ClassKey field value from RuleTree</li>
     * <li><strong>ruleList</strong>: the RuleKey field values under RuleList<blockquote>
     * <p>Call the <a href="~~GetBuildRiskDefineRuleConfig~~">GetBuildRiskDefineRuleConfig</a> operation to obtain this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
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
