// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreatePolicyShrinkRequest extends TeaModel {
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
    public String tagShrink;

    public static CreatePolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyShrinkRequest self = new CreatePolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicyShrinkRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public CreatePolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
