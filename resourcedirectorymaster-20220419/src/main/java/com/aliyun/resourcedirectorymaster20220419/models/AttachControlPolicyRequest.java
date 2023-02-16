// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AttachControlPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("TargetId")
    public String targetId;

    public static AttachControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachControlPolicyRequest self = new AttachControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AttachControlPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public AttachControlPolicyRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
