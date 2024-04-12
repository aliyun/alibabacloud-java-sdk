// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteDatabaseAccountRequest extends TeaModel {
    @NameInMap("DatabaseAccountId")
    public String databaseAccountId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseAccountRequest self = new DeleteDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseAccountRequest setDatabaseAccountId(String databaseAccountId) {
        this.databaseAccountId = databaseAccountId;
        return this;
    }
    public String getDatabaseAccountId() {
        return this.databaseAccountId;
    }

    public DeleteDatabaseAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDatabaseAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
