// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateControlPolicyRequest extends TeaModel {
    /**
     * <p>The new description of the access control policy.</p>
     * <br>
     * <p>The description must be 1 to 1,024 characters in length. The description can contain letters, digits, underscores (\_), and hyphens (-) and must start with a letter.</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The new document of the access control policy.</p>
     * <br>
     * <p>The document can be a maximum of 4,096 characters in length.</p>
     * <br>
     * <p>For more information about the languages of access control policies, see [Languages of access control policies](~~179096~~).</p>
     * <br>
     * <p>For more information about the examples of access control policies, see [Examples of custom access control policies](~~181474~~).</p>
     */
    @NameInMap("NewPolicyDocument")
    public String newPolicyDocument;

    /**
     * <p>The new name of the access control policy.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length. The name can contain letters, digits, and hyphens (-) and must start with a letter.</p>
     */
    @NameInMap("NewPolicyName")
    public String newPolicyName;

    /**
     * <p>The ID of the access control policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static UpdateControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPolicyRequest self = new UpdateControlPolicyRequest();
        return TeaModel.build(map, self);
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

    public UpdateControlPolicyRequest setNewPolicyName(String newPolicyName) {
        this.newPolicyName = newPolicyName;
        return this;
    }
    public String getNewPolicyName() {
        return this.newPolicyName;
    }

    public UpdateControlPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
