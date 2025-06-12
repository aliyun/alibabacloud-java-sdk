// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    /**
     * <p>The description of the policy.</p>
     * <p>The description must be 1 to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Query ECS instances in a specific region</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The document of the policy.</p>
     * <p>The document must be 1 to 6,144 characters in length.</p>
     * <p>For more information about policy elements and sample policies, see <a href="https://help.aliyun.com/document_detail/93738.html">Policy elements</a> and <a href="https://help.aliyun.com/document_detail/210969.html">Overview of sample policies</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Effect&quot;: &quot;Allow&quot;,&quot;Action&quot;: &quot;ecs:Describe*&quot;,&quot;Resource&quot;: &quot;acs:ecs:cn-qingdao:<em>:instance/</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The name of the policy.</p>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>View-ECS-instances-in-a-specific-region</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePolicyRequestTag> tag;

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

    public CreatePolicyRequest setTag(java.util.List<CreatePolicyRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePolicyRequestTag> getTag() {
        return this.tag;
    }

    public static class CreatePolicyRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestTag self = new CreatePolicyRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePolicyRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
