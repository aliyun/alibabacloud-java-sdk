// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQoeMetricDataRequest extends TeaModel {
    /**
     * <p>APP ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeQoeMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQoeMetricDataRequest self = new DescribeQoeMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQoeMetricDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeQoeMetricDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeQoeMetricDataRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeQoeMetricDataRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    public DescribeQoeMetricDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
