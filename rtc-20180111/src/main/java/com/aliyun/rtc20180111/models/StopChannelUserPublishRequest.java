// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopChannelUserPublishRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("UserId")
    public String userId;

    public static StopChannelUserPublishRequest build(java.util.Map<String, ?> map) throws Exception {
        StopChannelUserPublishRequest self = new StopChannelUserPublishRequest();
        return TeaModel.build(map, self);
    }

    public StopChannelUserPublishRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopChannelUserPublishRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public StopChannelUserPublishRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopChannelUserPublishRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StopChannelUserPublishRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
