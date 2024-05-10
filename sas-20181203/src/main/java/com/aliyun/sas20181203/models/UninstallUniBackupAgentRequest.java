// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallUniBackupAgentRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <br>
     * <p>> You can call the [DescribeUniBackupPolicies](~~DescribeUniBackupPolicies~~) operation to query the IDs of anti-ransomware policies.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    public static UninstallUniBackupAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallUniBackupAgentRequest self = new UninstallUniBackupAgentRequest();
        return TeaModel.build(map, self);
    }

    public UninstallUniBackupAgentRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
