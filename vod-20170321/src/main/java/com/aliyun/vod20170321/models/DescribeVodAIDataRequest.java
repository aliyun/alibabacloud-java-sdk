// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodAIDataRequest extends TeaModel {
    @NameInMap("AIType")
    public String AIType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodAIDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodAIDataRequest self = new DescribeVodAIDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodAIDataRequest setAIType(String AIType) {
        this.AIType = AIType;
        return this;
    }
    public String getAIType() {
        return this.AIType;
    }

    public DescribeVodAIDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodAIDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodAIDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodAIDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
