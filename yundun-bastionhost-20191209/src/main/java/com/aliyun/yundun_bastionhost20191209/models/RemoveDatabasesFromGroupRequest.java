// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveDatabasesFromGroupRequest extends TeaModel {
    @NameInMap("DatabaseIds")
    public java.util.List<String> databaseIds;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static RemoveDatabasesFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDatabasesFromGroupRequest self = new RemoveDatabasesFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDatabasesFromGroupRequest setDatabaseIds(java.util.List<String> databaseIds) {
        this.databaseIds = databaseIds;
        return this;
    }
    public java.util.List<String> getDatabaseIds() {
        return this.databaseIds;
    }

    public RemoveDatabasesFromGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public RemoveDatabasesFromGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveDatabasesFromGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
