// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateEventSubscribeRequest extends TeaModel {
    /**
     * <p>The ID of the subscribed application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9qb1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The callback URL. For information about the callback content, see the following callback content example.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****.com/callback</p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The ID of the subscribed channel.</p>
     * <blockquote>
     * <p>This parameter is required if the Users.N parameter is not empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123333</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The idempotence identifier used by the client to create the subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The subscribed events.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ChannelEvent</p>
     */
    @NameInMap("Events")
    public java.util.List<String> events;

    /**
     * <p>Specifies whether to enable callback authentication. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables callback authentication.</li>
     * <li><strong>fasle</strong> (default): disables callback authentication.</li>
     * </ul>
     * <p>For more information, see the following callback authentication description.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedCallbackAuth")
    public Boolean needCallbackAuth;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The user role. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: subscribes to host messages in the channel.</li>
     * <li><strong>2</strong>: subscribes to audience messages in the channel.</li>
     * <li><strong>Empty or other values</strong>: subscribes to messages from all roles in the channel without role filtering.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Role")
    public Long role;

    /**
     * <p>The subscribed users.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static CreateEventSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSubscribeRequest self = new CreateEventSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventSubscribeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateEventSubscribeRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateEventSubscribeRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateEventSubscribeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEventSubscribeRequest setEvents(java.util.List<String> events) {
        this.events = events;
        return this;
    }
    public java.util.List<String> getEvents() {
        return this.events;
    }

    public CreateEventSubscribeRequest setNeedCallbackAuth(Boolean needCallbackAuth) {
        this.needCallbackAuth = needCallbackAuth;
        return this;
    }
    public Boolean getNeedCallbackAuth() {
        return this.needCallbackAuth;
    }

    public CreateEventSubscribeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateEventSubscribeRequest setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public CreateEventSubscribeRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
