// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetDefaultPolicyVersionRequest extends TeaModel {
    /**
     * <p>The name of the policy.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The ID of the policy version that you want to set as the default version.</p>
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
