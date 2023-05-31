// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallBackupClientRequest extends TeaModel {
    /**
     * <p>The version of the anti-ransomware policy. You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the versions of anti-ransomware policies. Valid values:</p>
     * <br>
     * <p>*   **1.0.0**</p>
     * <p>*   **2.0.0**</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The UUID of the server from which you want to uninstall the anti-ransomware agent.</p>
     * <br>
     * <p>> You must specify at least one of the UuidList and Uuid parameters.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The UUIDs of the servers from which you want to uninstall the anti-ransomware agent.</p>
     * <br>
     * <p>> You must specify at least one of the UuidList and Uuid parameters.</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static UninstallBackupClientRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallBackupClientRequest self = new UninstallBackupClientRequest();
        return TeaModel.build(map, self);
    }

    public UninstallBackupClientRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public UninstallBackupClientRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public UninstallBackupClientRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
