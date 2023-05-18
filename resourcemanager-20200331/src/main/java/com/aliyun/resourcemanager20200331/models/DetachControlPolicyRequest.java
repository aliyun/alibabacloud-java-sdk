// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DetachControlPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the access control policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The ID of the object from which you want to detach the access control policy. Access control policies can be attached to the following objects:</p>
     * <br>
     * <p>*   Root folder</p>
     * <p>*   Subfolders of the Root folder</p>
     * <p>*   Members</p>
     */
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
