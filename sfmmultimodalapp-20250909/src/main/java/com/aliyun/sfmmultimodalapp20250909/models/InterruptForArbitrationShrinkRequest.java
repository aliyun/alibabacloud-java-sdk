// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class InterruptForArbitrationShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChatId")
    public String chatId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HubRequestId")
    public String hubRequestId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Interrupt")
    public String interruptShrink;

    @NameInMap("SessionId")
    public String sessionId;

    public static InterruptForArbitrationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InterruptForArbitrationShrinkRequest self = new InterruptForArbitrationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InterruptForArbitrationShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InterruptForArbitrationShrinkRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public InterruptForArbitrationShrinkRequest setHubRequestId(String hubRequestId) {
        this.hubRequestId = hubRequestId;
        return this;
    }
    public String getHubRequestId() {
        return this.hubRequestId;
    }

    public InterruptForArbitrationShrinkRequest setInterruptShrink(String interruptShrink) {
        this.interruptShrink = interruptShrink;
        return this;
    }
    public String getInterruptShrink() {
        return this.interruptShrink;
    }

    public InterruptForArbitrationShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
