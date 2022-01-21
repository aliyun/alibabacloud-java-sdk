// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGByAccessPointRequest extends TeaModel {
    @NameInMap("AccessPointId")
    public Integer accessPointId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGStatus")
    public String smartAGStatus;

    public static ListSmartAGByAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSmartAGByAccessPointRequest self = new ListSmartAGByAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public ListSmartAGByAccessPointRequest setAccessPointId(Integer accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public Integer getAccessPointId() {
        return this.accessPointId;
    }

    public ListSmartAGByAccessPointRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListSmartAGByAccessPointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListSmartAGByAccessPointRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSmartAGByAccessPointRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSmartAGByAccessPointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSmartAGByAccessPointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListSmartAGByAccessPointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListSmartAGByAccessPointRequest setSmartAGStatus(String smartAGStatus) {
        this.smartAGStatus = smartAGStatus;
        return this;
    }
    public String getSmartAGStatus() {
        return this.smartAGStatus;
    }

}
