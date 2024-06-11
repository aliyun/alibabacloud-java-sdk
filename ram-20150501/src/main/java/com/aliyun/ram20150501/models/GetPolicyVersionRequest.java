// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyVersionRequest extends TeaModel {
    /**
     * <p>The name of the policy.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The type of the policy. Valid values: `System` and `Custom`.</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The ID of the policy version.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static GetPolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyVersionRequest self = new GetPolicyVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicyVersionRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public GetPolicyVersionRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public GetPolicyVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
