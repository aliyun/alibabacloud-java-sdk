// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionRequest extends TeaModel {
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

    /**
     * <p>Specifies whether to set the version as the default access policy version.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>false (default): The version is not set as the default access policy version.</li>
     * <li>true: The version is set as the default access policy version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
