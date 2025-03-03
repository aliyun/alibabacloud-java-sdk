// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachControlPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-jExXAqIYkwHN****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The ID of the object to which you want to attach the access control policy. Access control policies can be attached to the following objects:</p>
     * <ul>
     * <li>Root folder</li>
     * <li>Subfolders of the Root folder</li>
     * <li>Members</li>
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
