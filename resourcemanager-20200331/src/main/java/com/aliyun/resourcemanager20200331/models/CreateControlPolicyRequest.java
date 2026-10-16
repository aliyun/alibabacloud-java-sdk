// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateControlPolicyRequest extends TeaModel {
    /**
     * <p>The description of the control policy.</p>
     * <p>The description must be 1 to 1024 characters in length, must start with a letter, and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleControlPolicy</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The effective scope of the control policy.</p>
     * <p>Valid values: RAM, which indicates that the control policy takes effect only for Resource Access Management (RAM) users or RAM roles.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RAM</p>
     */
    @NameInMap("EffectScope")
    public String effectScope;

    /**
     * <p>The content of the control policy.</p>
     * <p>The maximum length is 4096 characters.</p>
     * <p>For information about the control policy language, see <a href="https://help.aliyun.com/document_detail/179096.html">Control policy language</a>.</p>
     * <p>For examples of control policies, see <a href="https://help.aliyun.com/document_detail/181474.html">Examples of custom control policies</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:[&quot;ram:UpdateRole&quot;,&quot;ram:DeleteRole&quot;,&quot;ram:AttachPolicyToRole&quot;,&quot;ram:DetachPolicyFromRole&quot;],&quot;Resource&quot;:&quot;acs:ram:<em>:</em>:role/ResourceDirectoryAccountAccessRole&quot;}]}</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>Policy Name of the control policy.</p>
     * <p>Policy Name must be 1 to 128 characters in length, must start with a letter, and can contain letters, digits, and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleControlPolicy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static CreateControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateControlPolicyRequest self = new CreateControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateControlPolicyRequest setEffectScope(String effectScope) {
        this.effectScope = effectScope;
        return this;
    }
    public String getEffectScope() {
        return this.effectScope;
    }

    public CreateControlPolicyRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public CreateControlPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
