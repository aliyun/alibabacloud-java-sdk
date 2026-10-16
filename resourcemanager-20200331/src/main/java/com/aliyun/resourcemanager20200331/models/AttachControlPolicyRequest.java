// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachControlPolicyRequest extends TeaModel {
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
     * <p>The target node. Valid values:</p>
     * <ul>
     * <li>Root ID: attaches the control policy to the Root resource folder.</li>
     * <li>Resource folder ID: attaches the control policy to a resource folder.</li>
     * <li>Member ID: attaches the control policy to a member.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fd-ZDNPiT****</p>
     */
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
