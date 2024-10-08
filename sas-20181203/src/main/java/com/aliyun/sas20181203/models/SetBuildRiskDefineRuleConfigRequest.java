// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetBuildRiskDefineRuleConfigRequest extends TeaModel {
    /**
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
