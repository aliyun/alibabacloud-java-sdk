// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-0104730e9d*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>bp-298ahiu289</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static DeleteBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPolicyRequest self = new DeleteBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteBackupPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
