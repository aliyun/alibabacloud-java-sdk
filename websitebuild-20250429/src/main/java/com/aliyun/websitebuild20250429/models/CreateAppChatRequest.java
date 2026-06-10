// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppChatRequest extends TeaModel {
    /**
     * <p>Bot ID</p>
     * 
     * <strong>example:</strong>
     * <p>Zero2</p>
     */
    @NameInMap("BotId")
    public String botId;

    /**
     * <p>Chat ID to be provided when recovering a conversation after an execution break</p>
     * 
     * <strong>example:</strong>
     * <p>3b465fe1-6f06-4899-af9f-d43d9338df25</p>
     */
    @NameInMap("ChatId")
    public String chatId;

    /**
     * <p>Session ID; required from the second turn onward in a multi-turn conversation scenario</p>
     * 
     * <strong>example:</strong>
     * <p>593fe1a2-d0b4-4fde-a2b0-78ad6a438d41</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>List of conversation messages (in JSON array format)</p>
     * 
     * <strong>example:</strong>
     * <p>[\r\n  {\r\n    \&quot;role\&quot;: \&quot;user\&quot;,\r\n    \&quot;content\&quot;: \&quot;Prove that there are only five platonic solids, namely the tetrahedron, octahedron, icosahedron, cube, and dodecahedron.\&quot;\r\n  }\r\n]</p>
     */
    @NameInMap("Messages")
    public String messages;

    /**
     * <p>Site ID</p>
     * 
     * <strong>example:</strong>
     * <p>857240041851344</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    public static CreateAppChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppChatRequest self = new CreateAppChatRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppChatRequest setBotId(String botId) {
        this.botId = botId;
        return this;
    }
    public String getBotId() {
        return this.botId;
    }

    public CreateAppChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreateAppChatRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CreateAppChatRequest setMessages(String messages) {
        this.messages = messages;
        return this;
    }
    public String getMessages() {
        return this.messages;
    }

    public CreateAppChatRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

}
