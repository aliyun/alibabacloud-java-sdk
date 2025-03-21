// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodEditingUsageDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>2024-11-07T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>H264.SD</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <strong>example:</strong>
     * <p>2024-11-06T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodEditingUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodEditingUsageDataRequest self = new DescribeVodEditingUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodEditingUsageDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeVodEditingUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodEditingUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodEditingUsageDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodEditingUsageDataRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public DescribeVodEditingUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
