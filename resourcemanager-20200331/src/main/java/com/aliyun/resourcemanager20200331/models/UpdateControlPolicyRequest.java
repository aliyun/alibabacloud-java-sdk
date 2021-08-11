// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateControlPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("NewPolicyName")
    public String newPolicyName;

    @NameInMap("NewDescription")
    public String newDescription;

    @NameInMap("NewPolicyDocument")
    public String newPolicyDocument;

    public static UpdateControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPolicyRequest self = new UpdateControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateControlPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdateControlPolicyRequest setNewPolicyName(String newPolicyName) {
        this.newPolicyName = newPolicyName;
        return this;
    }
    public String getNewPolicyName() {
        return this.newPolicyName;
    }

    public UpdateControlPolicyRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdateControlPolicyRequest setNewPolicyDocument(String newPolicyDocument) {
        this.newPolicyDocument = newPolicyDocument;
        return this;
    }
    public String getNewPolicyDocument() {
        return this.newPolicyDocument;
    }

}
