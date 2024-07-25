// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PolicyConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example_action_policy</p>
     */
    @NameInMap("actionPolicyId")
    public String actionPolicyId;

    /**
     * <strong>example:</strong>
     * <p>sls.builtin.dynamic</p>
     */
    @NameInMap("alertPolicyId")
    public String alertPolicyId;

    /**
     * <strong>example:</strong>
     * <p>10m</p>
     */
    @NameInMap("repeatInterval")
    public String repeatInterval;

    public static PolicyConfiguration build(java.util.Map<String, ?> map) throws Exception {
        PolicyConfiguration self = new PolicyConfiguration();
        return TeaModel.build(map, self);
    }

    public PolicyConfiguration setActionPolicyId(String actionPolicyId) {
        this.actionPolicyId = actionPolicyId;
        return this;
    }
    public String getActionPolicyId() {
        return this.actionPolicyId;
    }

    public PolicyConfiguration setAlertPolicyId(String alertPolicyId) {
        this.alertPolicyId = alertPolicyId;
        return this;
    }
    public String getAlertPolicyId() {
        return this.alertPolicyId;
    }

    public PolicyConfiguration setRepeatInterval(String repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public String getRepeatInterval() {
        return this.repeatInterval;
    }

}
