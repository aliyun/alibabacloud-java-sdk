// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SetDefaultPolicyVersionRequest extends TeaModel {
    /**
     * <p>The name of the policy.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The ID of the policy version.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static SetDefaultPolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultPolicyVersionRequest self = new SetDefaultPolicyVersionRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultPolicyVersionRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public SetDefaultPolicyVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
