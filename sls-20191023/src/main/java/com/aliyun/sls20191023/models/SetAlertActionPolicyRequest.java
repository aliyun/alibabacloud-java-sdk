// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SetAlertActionPolicyRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("PolicyName")
    public String policyName;

    public static SetAlertActionPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAlertActionPolicyRequest self = new SetAlertActionPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetAlertActionPolicyRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public SetAlertActionPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public SetAlertActionPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetAlertActionPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
