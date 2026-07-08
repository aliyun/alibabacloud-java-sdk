// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDevicesRequest extends TeaModel {
    /**
     * <p>Queries by the ID of the group to which the device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****174-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Queries by device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4070*****1132-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Queries by device name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx路口摄像头</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries per page. The default is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The field to sort by. Valid value:</p>
     * <ul>
     * <li>id (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sorting order. The default is ascending. Valid values:</p>
     * <ul>
     * <li><p>asc (ascending)</p>
     * </li>
     * <li><p>desc (descending)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortDirection")
    public String sortDirection;

    /**
     * <p>Queries by device subtype. Valid values:</p>
     * <ul>
     * <li><p>bullet (bullet camera)</p>
     * </li>
     * <li><p>dome (dome camera)</p>
     * </li>
     * <li><p>ptz (PTZ camera)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dome</p>
     */
    @NameInMap("SubType")
    public String subType;

    /**
     * <p>Queries by device type. Valid values:</p>
     * <ul>
     * <li><p>ipc (camera)</p>
     * </li>
     * <li><p>platform (platform)</p>
     * </li>
     * <li><p>ied (intelligent edge device)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipc</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Queries by device vendor.</p>
     * 
     * <strong>example:</strong>
     * <p>公司A</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static DescribePurchasedDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDevicesRequest self = new DescribePurchasedDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDevicesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePurchasedDevicesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribePurchasedDevicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePurchasedDevicesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePurchasedDevicesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribePurchasedDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePurchasedDevicesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribePurchasedDevicesRequest setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

    public DescribePurchasedDevicesRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public DescribePurchasedDevicesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribePurchasedDevicesRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
