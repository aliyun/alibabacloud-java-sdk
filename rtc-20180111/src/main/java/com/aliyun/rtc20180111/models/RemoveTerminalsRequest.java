// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RemoveTerminalsRequest extends TeaModel {
    /**
     * <p>The application ID. Only one ID is supported.</p>
     * <p>You can create and query application IDs in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel that the user has joined. Only one ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A list of user IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1811xxxx</p>
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
