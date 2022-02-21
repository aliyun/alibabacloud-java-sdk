// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsTopDomainsByFlowRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsTopDomainsByFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsTopDomainsByFlowRequest self = new DescribeVsTopDomainsByFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsTopDomainsByFlowRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsTopDomainsByFlowRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeVsTopDomainsByFlowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsTopDomainsByFlowRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
