// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ReconnectAppChatRequest extends TeaModel {
    /**
     * <p>The chat record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20833ba4-d189-4c50-9a44-a6bcbda2c93b</p>
     */
    @NameInMap("ChatId")
    public String chatId;

    /**
     * <p>The conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5b7105a2-2999-430b-ba23-ba09149d5434</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The ID of the last event.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LastEventId")
    public Integer lastEventId;

    /**
     * <p>The creation time of the latest message.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-28 10:25:41</p>
     */
    @NameInMap("LatestMessageCreateTime")
    public String latestMessageCreateTime;

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

    public ReconnectAppChatRequest setLatestMessageCreateTime(String latestMessageCreateTime) {
        this.latestMessageCreateTime = latestMessageCreateTime;
        return this;
    }
    public String getLatestMessageCreateTime() {
        return this.latestMessageCreateTime;
    }

}
