// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2hz****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeChannelUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUsersRequest self = new DescribeChannelUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelUsersRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeChannelUsersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
