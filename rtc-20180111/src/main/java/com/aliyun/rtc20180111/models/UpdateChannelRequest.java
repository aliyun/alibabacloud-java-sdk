// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateChannelRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Nonce")
    public String nonce;

    public static UpdateChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChannelRequest self = new UpdateChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChannelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateChannelRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public UpdateChannelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateChannelRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
