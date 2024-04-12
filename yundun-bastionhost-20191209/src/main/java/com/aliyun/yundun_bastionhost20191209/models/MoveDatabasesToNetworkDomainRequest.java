// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class MoveDatabasesToNetworkDomainRequest extends TeaModel {
    @NameInMap("DatabaseIds")
    public java.util.List<String> databaseIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    @NameInMap("RegionId")
    public String regionId;

    public static MoveDatabasesToNetworkDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveDatabasesToNetworkDomainRequest self = new MoveDatabasesToNetworkDomainRequest();
        return TeaModel.build(map, self);
    }

    public MoveDatabasesToNetworkDomainRequest setDatabaseIds(java.util.List<String> databaseIds) {
        this.databaseIds = databaseIds;
        return this;
    }
    public java.util.List<String> getDatabaseIds() {
        return this.databaseIds;
    }

    public MoveDatabasesToNetworkDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MoveDatabasesToNetworkDomainRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public MoveDatabasesToNetworkDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
