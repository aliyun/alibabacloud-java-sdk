// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformsRequest extends TeaModel {
    @NameInMap("GbId")
    public String gbId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortDirection")
    public String sortDirection;

    @NameInMap("Status")
    public String status;

    public static DescribeParentPlatformsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformsRequest self = new DescribeParentPlatformsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParentPlatformsRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public DescribeParentPlatformsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeParentPlatformsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeParentPlatformsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeParentPlatformsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeParentPlatformsRequest setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

    public DescribeParentPlatformsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
