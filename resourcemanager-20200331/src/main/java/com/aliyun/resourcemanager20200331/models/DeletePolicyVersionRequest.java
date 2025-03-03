// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeletePolicyVersionRequest extends TeaModel {
    /**
     * <p>The name of the policy.</p>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS-Administrator</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The ID of the policy version.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/159982.html">ListPolicyVersions</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v3</p>
     */
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
