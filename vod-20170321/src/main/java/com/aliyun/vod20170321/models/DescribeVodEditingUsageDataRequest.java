// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodEditingUsageDataRequest extends TeaModel {
    /**
     * <p>The application ID. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-07T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region. By default, data from all regions is returned. You can specify multiple regions separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The output specification.</p>
     * 
     * <strong>example:</strong>
     * <p>H264.SD</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC.</p>
     * <p>If you leave this parameter empty, data from the last 24 hours is queried by default.</p>
     * 
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
