// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SetDefaultPolicyVersionRequest extends TeaModel {
    @NameInMap("PolicyName")
    @Validation(required = true)
    public String policyName;

    @NameInMap("VersionId")
    @Validation(required = true)
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
