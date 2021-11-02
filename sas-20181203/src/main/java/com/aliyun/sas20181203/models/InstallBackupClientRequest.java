// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallBackupClientRequest extends TeaModel {
    @NameInMap("PolicyVersion")
    public String policyVersion;

    @NameInMap("Uuid")
    public String uuid;

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
