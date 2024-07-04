// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class FreeResourceClusterControlItem extends TeaModel {
    @NameInMap("ClusterID")
    public String clusterID;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("CrossClusters")
    public Boolean crossClusters;

    @NameInMap("EnableFreeResource")
    public Boolean enableFreeResource;

    /**
     * <strong>example:</strong>
     * <p>frcc-whateversth</p>
     */
    @NameInMap("FreeResourceClusterControlId")
    public String freeResourceClusterControlId;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    @NameInMap("RegionID")
    public String regionID;

    public static FreeResourceClusterControlItem build(java.util.Map<String, ?> map) throws Exception {
        FreeResourceClusterControlItem self = new FreeResourceClusterControlItem();
        return TeaModel.build(map, self);
    }

    public FreeResourceClusterControlItem setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }
    public String getClusterID() {
        return this.clusterID;
    }

    public FreeResourceClusterControlItem setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public FreeResourceClusterControlItem setCrossClusters(Boolean crossClusters) {
        this.crossClusters = crossClusters;
        return this;
    }
    public Boolean getCrossClusters() {
        return this.crossClusters;
    }

    public FreeResourceClusterControlItem setEnableFreeResource(Boolean enableFreeResource) {
        this.enableFreeResource = enableFreeResource;
        return this;
    }
    public Boolean getEnableFreeResource() {
        return this.enableFreeResource;
    }

    public FreeResourceClusterControlItem setFreeResourceClusterControlId(String freeResourceClusterControlId) {
        this.freeResourceClusterControlId = freeResourceClusterControlId;
        return this;
    }
    public String getFreeResourceClusterControlId() {
        return this.freeResourceClusterControlId;
    }

    public FreeResourceClusterControlItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public FreeResourceClusterControlItem setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public FreeResourceClusterControlItem setRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }
    public String getRegionID() {
        return this.regionID;
    }

}
