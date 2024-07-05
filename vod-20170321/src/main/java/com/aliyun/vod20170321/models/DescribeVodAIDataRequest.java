// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodAIDataRequest extends TeaModel {
    /**
     * <p>The type of video AI. If you leave this parameter empty, statistics on video AI of all types are returned. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>AIVideoCensor</strong>: automated review</li>
     * <li><strong>AIVideoFPShot</strong>: media fingerprinting</li>
     * <li><strong>AIVideoTag</strong>: smart tagging</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AIVideoCensor</p>
     */
    @NameInMap("AIType")
    public String AIType;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-01T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region in which you want to query data. If you leave this parameter empty, data in all regions is returned. Separate multiple regions with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-01T13:00:00Z</p>
     */
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
