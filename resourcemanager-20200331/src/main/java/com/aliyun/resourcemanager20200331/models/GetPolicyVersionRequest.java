// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPolicyVersionRequest extends TeaModel {
    @NameInMap("PolicyType")
    @Validation(required = true)
    public String policyType;

    @NameInMap("PolicyName")
    @Validation(required = true)
    public String policyName;

    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    public static GetPolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyVersionRequest self = new GetPolicyVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicyVersionRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public GetPolicyVersionRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public GetPolicyVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
