// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupsRequest extends TeaModel {
    /**
     * <p>The space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33763950877224964-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Ingest protocol used by the group. Valid values:</p>
     * <ul>
     * <li><p>gb28181</p>
     * </li>
     * <li><p>rtmp</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("InProtocol")
    public String inProtocol;

    /**
     * <p>Whether to return device statistics for the group. Default: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeStats")
    public Boolean includeStats;

    /**
     * <p>Space name.</p>
     * 
     * <strong>example:</strong>
     * <p>我的视频监控</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Page number. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>Number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The service region where the group is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Field to sort by. Valid values:</p>
     * <ul>
     * <li>Id (default)</li>
     * </ul>
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

    /**
     * <p>Group status. Valid values:</p>
     * <ul>
     * <li><p>on (enabled)</p>
     * </li>
     * <li><p>off (disabled)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupsRequest self = new DescribeGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeGroupsRequest setInProtocol(String inProtocol) {
        this.inProtocol = inProtocol;
        return this;
    }
    public String getInProtocol() {
        return this.inProtocol;
    }

    public DescribeGroupsRequest setIncludeStats(Boolean includeStats) {
        this.includeStats = includeStats;
        return this;
    }
    public Boolean getIncludeStats() {
        return this.includeStats;
    }

    public DescribeGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeGroupsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeGroupsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeGroupsRequest setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

    public DescribeGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
