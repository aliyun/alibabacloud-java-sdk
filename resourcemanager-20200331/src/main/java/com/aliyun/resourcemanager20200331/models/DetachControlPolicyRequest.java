// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DetachControlPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-jExXAqIYkwHN****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The ID of the target node. Valid values:</p>
     * <ul>
     * <li>Root ID: detaches the control policy from the Root resource folder.</li>
     * <li>Resource folder ID: detaches the control policy from a resource folder.</li>
     * <li>Member ID: detaches the control policy from a member.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fd-ZDNPiT****</p>
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
