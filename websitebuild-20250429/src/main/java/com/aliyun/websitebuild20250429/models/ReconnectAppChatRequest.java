// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ReconnectAppChatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20833ba4-d189-4c50-9a44-a6bcbda2c93b</p>
     */
    @NameInMap("ChatId")
    public String chatId;

    /**
     * <strong>example:</strong>
     * <p>5b7105a2-2999-430b-ba23-ba09149d5434</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>event-71ece53b7d474e01b755a9b5fa5305e6</p>
     */
    @NameInMap("LastEventId")
    public Integer lastEventId;

    public static ReconnectAppChatRequest build(java.util.Map<String, ?> map) throws Exception {
        ReconnectAppChatRequest self = new ReconnectAppChatRequest();
        return TeaModel.build(map, self);
    }

    public ReconnectAppChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ReconnectAppChatRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ReconnectAppChatRequest setLastEventId(Integer lastEventId) {
        this.lastEventId = lastEventId;
        return this;
    }
    public Integer getLastEventId() {
        return this.lastEventId;
    }

}
