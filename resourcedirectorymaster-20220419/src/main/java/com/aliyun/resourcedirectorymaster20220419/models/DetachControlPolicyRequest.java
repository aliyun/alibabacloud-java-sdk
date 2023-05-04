// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DetachControlPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("TargetId")
    public String targetId;

    public static DetachControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachControlPolicyRequest self = new DetachControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DetachControlPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DetachControlPolicyRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
