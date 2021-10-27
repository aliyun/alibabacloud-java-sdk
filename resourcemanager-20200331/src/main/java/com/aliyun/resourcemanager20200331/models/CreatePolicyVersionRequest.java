// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionRequest extends TeaModel {
    @NameInMap("PolicyDocument")
    public String policyDocument;

    @NameInMap("PolicyName")
    public String policyName;

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
