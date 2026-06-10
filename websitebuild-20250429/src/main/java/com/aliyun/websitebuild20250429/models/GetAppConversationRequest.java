// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppConversationRequest extends TeaModel {
    /**
     * <p>Bot ID</p>
     * 
     * <strong>example:</strong>
     * <p>Zero2</p>
     */
    @NameInMap("BotId")
    public String botId;

    /**
     * <p>Session ID</p>
     * 
     * <strong>example:</strong>
     * <p>81bc5a34-1d8d-4ef7-a208-7401c51b054b</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    public static GetAppConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppConversationRequest self = new GetAppConversationRequest();
        return TeaModel.build(map, self);
    }

    public GetAppConversationRequest setBotId(String botId) {
        this.botId = botId;
        return this;
    }
    public String getBotId() {
        return this.botId;
    }

    public GetAppConversationRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

}
