// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableDedicatedHostClassesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("StorageType")
    public String storageType;

    public static DescribeAvailableDedicatedHostClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableDedicatedHostClassesRequest self = new DescribeAvailableDedicatedHostClassesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableDedicatedHostClassesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableDedicatedHostClassesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeAvailableDedicatedHostClassesRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
