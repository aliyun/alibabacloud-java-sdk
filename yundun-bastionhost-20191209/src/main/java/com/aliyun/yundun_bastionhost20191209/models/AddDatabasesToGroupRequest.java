// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddDatabasesToGroupRequest extends TeaModel {
    @NameInMap("DatabaseIds")
    public java.util.List<String> databaseIds;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static AddDatabasesToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDatabasesToGroupRequest self = new AddDatabasesToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddDatabasesToGroupRequest setDatabaseIds(java.util.List<String> databaseIds) {
        this.databaseIds = databaseIds;
        return this;
    }
    public java.util.List<String> getDatabaseIds() {
        return this.databaseIds;
    }

    public AddDatabasesToGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public AddDatabasesToGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDatabasesToGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
