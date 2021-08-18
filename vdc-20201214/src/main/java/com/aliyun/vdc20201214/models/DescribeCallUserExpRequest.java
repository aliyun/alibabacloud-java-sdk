// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallUserExpRequest extends TeaModel {
    // APP ID。
    @NameInMap("AppId")
    public String appId;

    // 频道ID。
    @NameInMap("ChannelId")
    public String channelId;

    // 创建频道时间，使用UNIX时间戳表示，单位：秒。
    @NameInMap("CreatedTs")
    public Long createdTs;

    // 频道释放时间，使用UNIX时间戳表示，单位：秒。参数为空表示获取当前时间。
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    public static DescribeCallUserExpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallUserExpRequest self = new DescribeCallUserExpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCallUserExpRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeCallUserExpRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeCallUserExpRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeCallUserExpRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

}
