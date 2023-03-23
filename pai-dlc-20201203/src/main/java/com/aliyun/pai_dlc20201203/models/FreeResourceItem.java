// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class FreeResourceItem extends TeaModel {
    @NameInMap("AvailableNumber")
    public Long availableNumber;

    @NameInMap("ClusterID")
    public String clusterID;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("FreeResourceId")
    public String freeResourceId;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    @NameInMap("RegionID")
    public String regionID;

    @NameInMap("ResourceType")
    public String resourceType;

    public static FreeResourceItem build(java.util.Map<String, ?> map) throws Exception {
        FreeResourceItem self = new FreeResourceItem();
        return TeaModel.build(map, self);
    }

    public FreeResourceItem setAvailableNumber(Long availableNumber) {
        this.availableNumber = availableNumber;
        return this;
    }
    public Long getAvailableNumber() {
        return this.availableNumber;
    }

    public FreeResourceItem setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }
    public String getClusterID() {
        return this.clusterID;
    }

    public FreeResourceItem setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public FreeResourceItem setFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
        return this;
    }
    public String getFreeResourceId() {
        return this.freeResourceId;
    }

    public FreeResourceItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public FreeResourceItem setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public FreeResourceItem setRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }
    public String getRegionID() {
        return this.regionID;
    }

    public FreeResourceItem setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
