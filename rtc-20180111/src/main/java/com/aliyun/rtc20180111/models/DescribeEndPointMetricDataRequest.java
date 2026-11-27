// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeEndPointMetricDataRequest extends TeaModel {
    /**
     * <p>The app ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testappid</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The channel ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The start time of the query time range. This time cannot be earlier than the actual creation time of the channel or more than 30 days ago. The time is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    /**
     * <p>The end time of the query time range. This time cannot be later than the release time of the channel. The time is a UNIX timestamp in seconds. If this parameter is left empty, the current time is used.</p>
     * <blockquote>
     * <p>If the specified end time is later than the release time of the channel, the data from the start time to the release time of the channel is returned, and a maximum of data from the last 3 hours is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    /**
     * <p>The list of metric enumerations. Separate multiple metrics with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VIDEO_STUCK_CAMERA</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The call IDs of the communication streams for the publisher. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p>You can specify either PubUserId or PubCallIdList.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testcall1,testcall2</p>
     */
    @NameInMap("PubCallIdList")
    public String pubCallIdList;

    /**
     * <p>The user ID of the publisher.</p>
     * <blockquote>
     * <p>You can specify either PubUserId or PubCallIdList.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testuserid2</p>
     */
    @NameInMap("PubUserId")
    public String pubUserId;

    /**
     * <p>The user ID of the subscriber.</p>
     * 
     * <strong>example:</strong>
     * <p>testuserid</p>
     */
    @NameInMap("SubUserId")
    public String subUserId;

    public static DescribeEndPointMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndPointMetricDataRequest self = new DescribeEndPointMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndPointMetricDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeEndPointMetricDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeEndPointMetricDataRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeEndPointMetricDataRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    public DescribeEndPointMetricDataRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeEndPointMetricDataRequest setPubCallIdList(String pubCallIdList) {
        this.pubCallIdList = pubCallIdList;
        return this;
    }
    public String getPubCallIdList() {
        return this.pubCallIdList;
    }

    public DescribeEndPointMetricDataRequest setPubUserId(String pubUserId) {
        this.pubUserId = pubUserId;
        return this;
    }
    public String getPubUserId() {
        return this.pubUserId;
    }

    public DescribeEndPointMetricDataRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
