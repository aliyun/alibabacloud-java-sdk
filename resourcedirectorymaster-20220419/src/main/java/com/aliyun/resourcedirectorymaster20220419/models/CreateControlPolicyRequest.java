// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CreateControlPolicyRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EffectScope")
    public String effectScope;

    @NameInMap("PolicyDocument")
    public String policyDocument;

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
