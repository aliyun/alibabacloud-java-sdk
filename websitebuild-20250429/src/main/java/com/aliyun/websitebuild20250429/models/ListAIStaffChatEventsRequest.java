// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAIStaffChatEventsRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Chat ID (optional; if not provided, the latest chatId is used)</p>
     * 
     * <strong>example:</strong>
     * <p>20833ba4-d189-4c50-9a44-a6bcbda2c93b</p>
     */
    @NameInMap("ChatId")
    public String chatId;

    /**
     * <p>session ID</p>
     * 
     * <strong>example:</strong>
     * <p>593fe1a2-d0b4-4fde-a2b0-78ad6a438d41</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>Last event ID, used for incremental retrieval</p>
     * 
     * <strong>example:</strong>
     * <p>event-71ece53b7d474e01b755a9b5fa5305e6</p>
     */
    @NameInMap("LastEventId")
    public Integer lastEventId;

    public static ListAIStaffChatEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIStaffChatEventsRequest self = new ListAIStaffChatEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListAIStaffChatEventsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAIStaffChatEventsRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ListAIStaffChatEventsRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ListAIStaffChatEventsRequest setLastEventId(Integer lastEventId) {
        this.lastEventId = lastEventId;
        return this;
    }
    public Integer getLastEventId() {
        return this.lastEventId;
    }

}
