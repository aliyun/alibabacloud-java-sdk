// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupMachineStatusRequest extends TeaModel {
    @NameInMap("PolicyId")
    public Long policyId;

    @NameInMap("PolicyVersion")
    public String policyVersion;

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
