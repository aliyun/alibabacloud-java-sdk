// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RemoveTerminalsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TerminalIds")
    public java.util.List<String> terminalIds;

    public static RemoveTerminalsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTerminalsRequest self = new RemoveTerminalsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTerminalsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveTerminalsRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RemoveTerminalsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveTerminalsRequest setTerminalIds(java.util.List<String> terminalIds) {
        this.terminalIds = terminalIds;
        return this;
    }
    public java.util.List<String> getTerminalIds() {
        return this.terminalIds;
    }

}
