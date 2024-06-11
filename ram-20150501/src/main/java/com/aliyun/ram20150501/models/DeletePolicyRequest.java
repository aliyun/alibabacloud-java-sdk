// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeletePolicyRequest extends TeaModel {
    /**
     * <p>The name of the policy.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static DeletePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyRequest self = new DeletePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
