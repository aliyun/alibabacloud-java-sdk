// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    public String policyId;

    public static DeleteControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlPolicyRequest self = new DeleteControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteControlPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
