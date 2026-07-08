// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamsRequest extends TeaModel {
    /**
     * <p>Filter by application.</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>Filter by device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Filter by domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the space to query.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****174-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Stream ID.</p>
     * <blockquote>
     * <p>Enter multiple IDs separated by commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>323*****997-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Filter by stream name.</p>
     * <blockquote>
     * <p>Enter multiple names separated by commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3100000*****00000002</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>Number of items per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Parent device ID of the device that hosts this stream.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****774-cn-qingdao</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>Sort results by a field. Valid values:</p>
     * <ul>
     * <li><p>Id (default)</p>
     * </li>
     * <li><p>GroupId</p>
     * </li>
     * <li><p>Name</p>
     * </li>
     * <li><p>DeviceId</p>
     * </li>
     * <li><p>Protocol</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can specify only one field.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Sort order. Valid values:</p>
     * <ul>
     * <li><p>asc (ascending, default)</p>
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

    public static DescribeStreamsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamsRequest self = new DescribeStreamsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStreamsRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeStreamsRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DescribeStreamsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeStreamsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeStreamsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeStreamsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeStreamsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStreamsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeStreamsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeStreamsRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeStreamsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeStreamsRequest setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

}
