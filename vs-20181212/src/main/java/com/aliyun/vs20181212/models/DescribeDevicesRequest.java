// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDevicesRequest extends TeaModel {
    /**
     * <p>The ID of the directory to which the device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****488-cn-qingdao</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The serial number of the device. The value must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>7D0*****4C0</p>
     */
    @NameInMap("Dsn")
    public String dsn;

    /**
     * <p>You can query by device national standard ID.</p>
     * 
     * <strong>example:</strong>
     * <p>310000000****0000002</p>
     */
    @NameInMap("GbId")
    public String gbId;

    /**
     * <p>Query by device Space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****174-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The device ID.</p>
     * <blockquote>
     * <p>Specify multiple IDs. Separate them with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether to return directory information. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDirectory")
    public Boolean includeDirectory;

    /**
     * <p>Specifies whether to return stream statistics. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeStats")
    public Boolean includeStats;

    /**
     * <p>The device name.</p>
     * <blockquote>
     * <p>Specify multiple names. Separate them with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>摄像头A</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the parent device.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****774-cn-qingdao</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The field by which to sort the results. Valid value:</p>
     * <blockquote>
     * <p>id (default)</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>asc (ascending) (default)</p>
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
     * <p>Query devices by status.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The device type. Valid values:</p>
     * <ul>
     * <li><p>ipc (camera)</p>
     * </li>
     * <li><p>platform</p>
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
     * <p>Query by device manufacturer.</p>
     * 
     * <strong>example:</strong>
     * <p>8yd*****qem</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static DescribeDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesRequest self = new DescribeDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeDevicesRequest setDsn(String dsn) {
        this.dsn = dsn;
        return this;
    }
    public String getDsn() {
        return this.dsn;
    }

    public DescribeDevicesRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public DescribeDevicesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDevicesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDevicesRequest setIncludeDirectory(Boolean includeDirectory) {
        this.includeDirectory = includeDirectory;
        return this;
    }
    public Boolean getIncludeDirectory() {
        return this.includeDirectory;
    }

    public DescribeDevicesRequest setIncludeStats(Boolean includeStats) {
        this.includeStats = includeStats;
        return this;
    }
    public Boolean getIncludeStats() {
        return this.includeStats;
    }

    public DescribeDevicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDevicesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDevicesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDevicesRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeDevicesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDevicesRequest setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

    public DescribeDevicesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDevicesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDevicesRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
