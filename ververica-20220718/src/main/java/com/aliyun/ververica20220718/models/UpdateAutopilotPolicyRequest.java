// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateAutopilotPolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic tuning. A value of true enables automatic tuning (ACTIVE), and a value of false disables tuning (DISABLED). If this parameter is not specified, the current status is not changed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The tuning policy configuration. This parameter uses full PUT mode: when specified, the complete policy object replaces the existing configuration entirely (fields not included are cleared). If this parameter is not specified, the existing configuration is retained.</p>
     */
    @NameInMap("policyConfig")
    public AutopilotPolicy policyConfig;

    public static UpdateAutopilotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutopilotPolicyRequest self = new UpdateAutopilotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutopilotPolicyRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateAutopilotPolicyRequest setPolicyConfig(AutopilotPolicy policyConfig) {
        this.policyConfig = policyConfig;
        return this;
    }
    public AutopilotPolicy getPolicyConfig() {
        return this.policyConfig;
    }

}
