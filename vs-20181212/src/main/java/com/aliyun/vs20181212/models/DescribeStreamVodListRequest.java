// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamVodListRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeStreamVodListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamVodListRequest self = new DescribeStreamVodListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStreamVodListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeStreamVodListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeStreamVodListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStreamVodListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
