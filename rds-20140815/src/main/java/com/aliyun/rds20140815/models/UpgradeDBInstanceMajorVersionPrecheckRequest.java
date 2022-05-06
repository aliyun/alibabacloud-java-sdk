// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionPrecheckRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TargetMajorVersion")
    public String targetMajorVersion;

    public static UpgradeDBInstanceMajorVersionPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceMajorVersionPrecheckRequest self = new UpgradeDBInstanceMajorVersionPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setTargetMajorVersion(String targetMajorVersion) {
        this.targetMajorVersion = targetMajorVersion;
        return this;
    }
    public String getTargetMajorVersion() {
        return this.targetMajorVersion;
    }

}
