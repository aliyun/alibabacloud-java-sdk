// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityOverallDataRequest extends TeaModel {
    /**
     * <p>APP ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0rbd****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The End Time of the query, represented as a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615910399</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The Start Time of the query, represented as a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615824000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>The Metric Types to query, separated by commas (,). Valid values:</p>
     * <ul>
     * <li><strong>JOIN_CHANNEL_SUC_RATE</strong>: Channel Join Success Rate.</li>
     * <li><strong>JOIN_CHANNEL_SUC_FIVE_SEC_RATE</strong>: Five-second Channel Join Success Rate.</li>
     * <li><strong>VIDEO_FIRST_PIC_DUR</strong>: Time to First Video Frame.</li>
     * <li><strong>AUDIO_STUCK_RATE</strong>: Audio Lag Rate.</li>
     * <li><strong>VIDEO_STUCK_RATE</strong>: Video Lag Rate.</li>
     * <li><strong>AUDIO_DELAY</strong>: Audio Delay.</li>
     * <li><strong>VIDEO_DELAY</strong>: Video Delay.</li>
     * <li><strong>AUDIO_HIGH_QUALITY_TRANSMISSION_RATE</strong>: Audio High-quality Transmission Rate.</li>
     * <li><strong>VIDEO_HIGH_QUALITY_TRANSMISSION_RATE</strong>: Video High-quality Transmission Rate.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JOIN_CHANNEL_SUC_RATE</p>
     */
    @NameInMap("Types")
    public String types;

    public static DescribeQualityOverallDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityOverallDataRequest self = new DescribeQualityOverallDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQualityOverallDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeQualityOverallDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeQualityOverallDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeQualityOverallDataRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
