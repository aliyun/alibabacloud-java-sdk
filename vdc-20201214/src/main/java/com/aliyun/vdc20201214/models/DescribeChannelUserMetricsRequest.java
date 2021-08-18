// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelUserMetricsRequest extends TeaModel {
    // APP ID。
    @NameInMap("AppId")
    public String appId;

    // 频道ID。
    @NameInMap("ChannelId")
    public String channelId;

    // 频道的创建时间戳，使用UNIX时间戳表示，单位：秒。
    @NameInMap("CreatedTs")
    public Long createdTs;

    // 频道释放时间，使用UNIX时间戳表示，单位：秒。参数为空表示获取当前时间。
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    public static DescribeChannelUserMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUserMetricsRequest self = new DescribeChannelUserMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUserMetricsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelUserMetricsRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeChannelUserMetricsRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeChannelUserMetricsRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

}
