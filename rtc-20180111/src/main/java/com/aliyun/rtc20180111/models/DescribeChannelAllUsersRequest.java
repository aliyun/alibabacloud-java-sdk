// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelAllUsersRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    public static DescribeChannelAllUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelAllUsersRequest self = new DescribeChannelAllUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelAllUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelAllUsersRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
