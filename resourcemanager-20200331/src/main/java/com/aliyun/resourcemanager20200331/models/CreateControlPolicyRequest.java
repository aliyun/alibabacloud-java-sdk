// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateControlPolicyRequest extends TeaModel {
    /**
     * <p>The description of the access control policy.</p>
     * <br>
     * <p>The description must be 1 to 1,024 characters in length. The description can contain letters, digits, underscores (\_), and hyphens (-) and must start with a letter.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The effective scope of the access control policy.</p>
     * <br>
     * <p>The value RAM indicates that the access control policy takes effect only for RAM users and RAM roles.</p>
     */
    @NameInMap("EffectScope")
    public String effectScope;

    /**
     * <p>The document of the access control policy.</p>
     * <br>
     * <p>The document can be a maximum of 4,096 characters in length.</p>
     * <br>
     * <p>For more information about the languages of access control policies, see [Languages of access control policies](~~179096~~).</p>
     * <br>
     * <p>For more information about the examples of access control policies, see [Examples of custom access control policies](~~181474~~).</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The name of the access control policy.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length. The name can contain letters, digits, and hyphens (-) and must start with a letter.</p>
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
