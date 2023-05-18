// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionRequest extends TeaModel {
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

    /**
     * <p>Specifies whether to set the policy version as the default version. Valid values:</p>
     * <br>
     * <p>*   false: The policy version is not set as the default version.</p>
     * <p>*   true: The policy version is set as the default version.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("SetAsDefault")
    public Boolean setAsDefault;

    public static CreatePolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyVersionRequest self = new CreatePolicyVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyVersionRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public CreatePolicyVersionRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyVersionRequest setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
        return this;
    }
    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

}
