// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CreateControlPolicyRequest extends TeaModel {
    /**
     * <p>The description of the access control policy.</p>
     * <p>The description must be 1 to 1,024 characters in length. The description can contain letters, digits, underscores (_), and hyphens (-) and must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleControlPolicy</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The effective scope of the access control policy.</p>
     * <p>The value RAM indicates that the access control policy takes effect only for RAM users and RAM roles.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RAM</p>
     */
    @NameInMap("EffectScope")
    public String effectScope;

    /**
     * <p>The document of the access control policy.</p>
     * <p>The document can be a maximum of 4,096 characters in length.</p>
     * <p>For more information about the languages of access control policies, see <a href="https://help.aliyun.com/document_detail/179096.html">Languages of access control policies</a>.</p>
     * <p>For more information about the examples of access control policies, see <a href="https://help.aliyun.com/document_detail/181474.html">Examples of custom access control policies</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:[&quot;ram:UpdateRole&quot;,&quot;ram:DeleteRole&quot;,&quot;ram:AttachPolicyToRole&quot;,&quot;ram:DetachPolicyFromRole&quot;],&quot;Resource&quot;:&quot;acs:ram:<em>:</em>:role/ResourceDirectoryAccountAccessRole&quot;}]}</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The name of the access control policy.</p>
     * <p>The name must be 1 to 128 characters in length. The name can contain letters, digits, and hyphens (-) and must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleControlPolicy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The tag to add to the access control policy.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateControlPolicyRequestTag> tag;

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

    public CreateControlPolicyRequest setTag(java.util.List<CreateControlPolicyRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateControlPolicyRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateControlPolicyRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateControlPolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateControlPolicyRequestTag self = new CreateControlPolicyRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateControlPolicyRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateControlPolicyRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
