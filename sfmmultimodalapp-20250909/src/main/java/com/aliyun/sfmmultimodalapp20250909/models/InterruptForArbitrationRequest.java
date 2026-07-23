// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class InterruptForArbitrationRequest extends TeaModel {
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
    public InterruptForArbitrationRequestInterrupt interrupt;

    @NameInMap("SessionId")
    public String sessionId;

    public static InterruptForArbitrationRequest build(java.util.Map<String, ?> map) throws Exception {
        InterruptForArbitrationRequest self = new InterruptForArbitrationRequest();
        return TeaModel.build(map, self);
    }

    public InterruptForArbitrationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InterruptForArbitrationRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public InterruptForArbitrationRequest setHubRequestId(String hubRequestId) {
        this.hubRequestId = hubRequestId;
        return this;
    }
    public String getHubRequestId() {
        return this.hubRequestId;
    }

    public InterruptForArbitrationRequest setInterrupt(InterruptForArbitrationRequestInterrupt interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public InterruptForArbitrationRequestInterrupt getInterrupt() {
        return this.interrupt;
    }

    public InterruptForArbitrationRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class InterruptForArbitrationRequestInterrupt extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Submit")
        public Boolean submit;

        public static InterruptForArbitrationRequestInterrupt build(java.util.Map<String, ?> map) throws Exception {
            InterruptForArbitrationRequestInterrupt self = new InterruptForArbitrationRequestInterrupt();
            return TeaModel.build(map, self);
        }

        public InterruptForArbitrationRequestInterrupt setSubmit(Boolean submit) {
            this.submit = submit;
            return this;
        }
        public Boolean getSubmit() {
            return this.submit;
        }

    }

}
