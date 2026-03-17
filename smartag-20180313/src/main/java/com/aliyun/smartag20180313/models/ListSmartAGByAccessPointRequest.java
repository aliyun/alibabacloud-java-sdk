// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGByAccessPointRequest extends TeaModel {
    /**
     * <p>The ID of the access point.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>238</p>
     */
    @NameInMap("AccessPointId")
    public Integer accessPointId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>. Maximum value: <strong>50</strong> .</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>A region contains one or more access points. You can call the <a href="https://help.aliyun.com/document_detail/183876.html">ListAccessPoints</a> operation to query access points in a specific region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the SAG instance. Valid values:</p>
     * <ul>
     * <li><strong>Active</strong>: The SAG device is connected to Alibaba Cloud.</li>
     * <li><strong>offline</strong>: The SAG device is disconnected from Alibaba Cloud.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
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
