// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupMachineStatusRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the IDs of anti-ransomware policies.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The version of the anti-ransomware policy. Valid values:</p>
     * <ul>
     * <li><strong>1.0.0</strong></li>
     * <li><strong>2.0.0</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeBackupPolicy~~">DescribeBackupPolicy</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eb2c782e-64f2-4590-a86c-d90164df****</p>
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
