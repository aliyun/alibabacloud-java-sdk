// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelJoinInfoRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    // 频道ID
    @NameInMap("ChannelId")
    public String channelId;

    // 频道创建时间
    @NameInMap("CreatedTs")
    public Long createdTs;

    // 频道释放时间
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    public static DescribeChannelJoinInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelJoinInfoRequest self = new DescribeChannelJoinInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelJoinInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelJoinInfoRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeChannelJoinInfoRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeChannelJoinInfoRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

}
