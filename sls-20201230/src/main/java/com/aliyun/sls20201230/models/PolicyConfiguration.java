// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PolicyConfiguration extends TeaModel {
    @NameInMap("actionPolicyId")
    public String actionPolicyId;

    @NameInMap("alertPolicyId")
    public String alertPolicyId;

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
