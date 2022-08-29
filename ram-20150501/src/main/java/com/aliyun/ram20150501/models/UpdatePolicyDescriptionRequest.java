// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdatePolicyDescriptionRequest extends TeaModel {
    @NameInMap("NewDescription")
    public String newDescription;

    @NameInMap("PolicyName")
    public String policyName;

    public static UpdatePolicyDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyDescriptionRequest self = new UpdatePolicyDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyDescriptionRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdatePolicyDescriptionRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
