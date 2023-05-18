// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    /**
     * <p>The description of the policy.</p>
     * <br>
     * <p>The description must be 1 to 1,024 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The document of the policy.</p>
     * <br>
     * <p>The document must be 1 to 2,048 characters in length.</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The name of the policy.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicyRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public CreatePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
