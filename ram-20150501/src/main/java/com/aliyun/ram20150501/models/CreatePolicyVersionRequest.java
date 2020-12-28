// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyDocument")
    public String policyDocument;

    @NameInMap("SetAsDefault")
    public Boolean setAsDefault;

    @NameInMap("RotateStrategy")
    public String rotateStrategy;

    public static CreatePolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyVersionRequest self = new CreatePolicyVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyVersionRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyVersionRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public CreatePolicyVersionRequest setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
        return this;
    }
    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    public CreatePolicyVersionRequest setRotateStrategy(String rotateStrategy) {
        this.rotateStrategy = rotateStrategy;
        return this;
    }
    public String getRotateStrategy() {
        return this.rotateStrategy;
    }

}
