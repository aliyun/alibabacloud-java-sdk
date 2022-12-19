// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallBackupClientRequest extends TeaModel {
    // The version of the anti-ransomware policy. You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the versions of anti-ransomware policies. Valid values:
    // 
    // *   **1.0.0**
    // *   **2.0.0**
    @NameInMap("PolicyVersion")
    public String policyVersion;

    // The UUID of the server on which you want to install the anti-ransomware agent.
    // 
    // >  You must specify at least one of the UuidList and Uuid parameters.
    @NameInMap("Uuid")
    public String uuid;

    // The UUIDs of servers on which you want to install the anti-ransomware agent.
    // 
    // >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static InstallBackupClientRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallBackupClientRequest self = new InstallBackupClientRequest();
        return TeaModel.build(map, self);
    }

    public InstallBackupClientRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public InstallBackupClientRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public InstallBackupClientRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
