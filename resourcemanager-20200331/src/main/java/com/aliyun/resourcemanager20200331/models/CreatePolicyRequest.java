// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    /**
     * <p>The description of the access policy.</p>
     * <p>The description must be 1 to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS administrator permissions</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The content of the access policy.</p>
     * <p>The content must be 1 to 6,144 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Statement&quot;: [{ &quot;Action&quot;: [&quot;oss:<em>&quot;], &quot;Effect&quot;: &quot;Allow&quot;, &quot;Resource&quot;: [&quot;acs:oss:</em>:<em>:</em>&quot;]}], &quot;Version&quot;: &quot;1&quot;}</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>Policy Name of the access policy.</p>
     * <p>Policy Name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS-Administrator</p>
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
