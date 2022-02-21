// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamsRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("SortBy")
    public String sortBy;

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
