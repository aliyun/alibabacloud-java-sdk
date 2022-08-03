// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class DeletePolicyVersionRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("VersionId")
    public String versionId;

    public static DeletePolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyVersionRequest self = new DeletePolicyVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyVersionRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DeletePolicyVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
