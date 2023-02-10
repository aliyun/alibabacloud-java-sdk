// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupMachineStatusRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <br>
     * <p>>  You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the IDs of anti-ransomware policies.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The version of the anti-ransomware policy. Valid values:</p>
     * <br>
     * <p>*   **1.0.0**</p>
     * <p>*   **2.0.0**</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The UUID of the server.</p>
     * <br>
     * <p>>  You can call the [DescribeBackupPolicy](~~DescribeBackupPolicy~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeBackupMachineStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupMachineStatusRequest self = new DescribeBackupMachineStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupMachineStatusRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public DescribeBackupMachineStatusRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public DescribeBackupMachineStatusRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
