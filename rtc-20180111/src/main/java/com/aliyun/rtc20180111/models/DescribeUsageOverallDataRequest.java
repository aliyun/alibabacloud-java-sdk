// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageOverallDataRequest extends TeaModel {
    /**
     * <p>The app ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2hz****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615910399</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615824000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>The metric types to query. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>TOTAL_CALL_DURATION</strong>: total duration.</li>
     * <li><strong>VIDEO_CALL_DURATION</strong>: video communication duration.</li>
     * <li><strong>AUDIO_CALL_DURATION</strong>: audio communication duration.</li>
     * <li><strong>CALL_CHANNEL_COUNT</strong>: communication channel count.</li>
     * <li><strong>HIGHLY_CONCURRENT_CHANNEL_COUNT</strong>: highly concurrent communication channel count.</li>
     * <li><strong>CHANNEL_CONCURRENT_PEAK</strong>: peak concurrent channel count.</li>
     * <li><strong>ONLINE_USER_PEAK</strong>: peak online user count.</li>
     * <li><strong>TOTAL_CALL_USER</strong>: total call users.</li>
     * <li><strong>TOTAL_INOUT_NUM</strong>: total inbound and outbound visits.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ONLINE_USER_PEAK</p>
     */
    @NameInMap("Types")
    public String types;

    public static DescribeUsageOverallDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageOverallDataRequest self = new DescribeUsageOverallDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsageOverallDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeUsageOverallDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeUsageOverallDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeUsageOverallDataRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
