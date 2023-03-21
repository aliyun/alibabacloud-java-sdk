// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUniBackupPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    public Long policyId;

    @NameInMap("PolicyIds")
    public String policyIds;

    public static DeleteUniBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUniBackupPolicyRequest self = new DeleteUniBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUniBackupPolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public DeleteUniBackupPolicyRequest setPolicyIds(String policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public String getPolicyIds() {
        return this.policyIds;
    }

}
