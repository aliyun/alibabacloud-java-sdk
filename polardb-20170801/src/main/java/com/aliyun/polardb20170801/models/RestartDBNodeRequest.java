// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartDBNodeRequest extends TeaModel {
    /**
     * <p>The ID of the node.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/185342.html">DescribeDBClusters</a> operation to query the details of all clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-*************</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    @NameInMap("FromTimeService")
    public String fromTimeService;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RestartDBNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDBNodeRequest self = new RestartDBNodeRequest();
        return TeaModel.build(map, self);
    }

    public RestartDBNodeRequest setDBNodeId(String DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    public RestartDBNodeRequest setFromTimeService(String fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public String getFromTimeService() {
        return this.fromTimeService;
    }

    public RestartDBNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestartDBNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestartDBNodeRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public RestartDBNodeRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public RestartDBNodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestartDBNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestartDBNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
