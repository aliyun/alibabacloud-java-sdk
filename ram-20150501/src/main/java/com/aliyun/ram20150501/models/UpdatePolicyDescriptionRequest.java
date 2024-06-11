// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdatePolicyDescriptionRequest extends TeaModel {
    /**
     * <p>The description of the policy.</p>
     * <br>
     * <p>The value of the parameter must be 1 to 1,024 characters in length.</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The name of the policy.</p>
     */
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
