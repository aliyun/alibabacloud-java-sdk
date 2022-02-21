// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsUpPeakPublishStreamDataRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainSwitch")
    public String domainSwitch;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsUpPeakPublishStreamDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsUpPeakPublishStreamDataRequest self = new DescribeVsUpPeakPublishStreamDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsUpPeakPublishStreamDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsUpPeakPublishStreamDataRequest setDomainSwitch(String domainSwitch) {
        this.domainSwitch = domainSwitch;
        return this;
    }
    public String getDomainSwitch() {
        return this.domainSwitch;
    }

    public DescribeVsUpPeakPublishStreamDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsUpPeakPublishStreamDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsUpPeakPublishStreamDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
