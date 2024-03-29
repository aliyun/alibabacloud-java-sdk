// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRecordsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PrivateBucket")
    public Boolean privateBucket;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortDirection")
    public String sortDirection;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StreamId")
    public String streamId;

    @NameInMap("Type")
    public String type;

    public static DescribeRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordsRequest self = new DescribeRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRecordsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordsRequest setPrivateBucket(Boolean privateBucket) {
        this.privateBucket = privateBucket;
        return this;
    }
    public Boolean getPrivateBucket() {
        return this.privateBucket;
    }

    public DescribeRecordsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeRecordsRequest setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

    public DescribeRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRecordsRequest setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

    public DescribeRecordsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
