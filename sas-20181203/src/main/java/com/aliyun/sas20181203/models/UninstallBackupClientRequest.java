// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallBackupClientRequest extends TeaModel {
    @NameInMap("PolicyVersion")
    public String policyVersion;

    @NameInMap("Uuid")
    public String uuid;

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
