// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeEndPointMetricDataRequest extends TeaModel {
    /**
     * <p>APP ID。</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CreatedTs")
    public Long createdTs;

    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    @NameInMap("Metrics")
    public String metrics;

    @NameInMap("PubCallIdList")
    public String pubCallIdList;

    @NameInMap("PubUserId")
    public String pubUserId;

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
