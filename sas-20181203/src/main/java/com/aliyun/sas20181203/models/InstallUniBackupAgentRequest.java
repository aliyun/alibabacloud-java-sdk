// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallUniBackupAgentRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <br>
     * <p>> You can call the [DescribeUniBackupPolicies](~~DescribeUniBackupPolicies~~) operation to query the IDs of anti-ransomware policies.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    public static InstallUniBackupAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallUniBackupAgentRequest self = new InstallUniBackupAgentRequest();
        return TeaModel.build(map, self);
    }

    public InstallUniBackupAgentRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
