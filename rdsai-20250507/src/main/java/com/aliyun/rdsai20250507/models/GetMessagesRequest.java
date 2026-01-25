// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetMessagesRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to <strong>GetMessages</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>941c6f59-acf5-4e11-9adc-31e52e1f****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("EventMode")
    public String eventMode;

    /**
     * <p>The ID of the conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>038866af-a050-4bc5-bfad-b7bfc838****</p>
     */
    @NameInMap("FirstId")
    public String firstId;

    /**
     * <p>The ID of the first message.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    public static GetMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessagesRequest self = new GetMessagesRequest();
        return TeaModel.build(map, self);
    }

    public GetMessagesRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public GetMessagesRequest setEventMode(String eventMode) {
        this.eventMode = eventMode;
        return this;
    }
    public String getEventMode() {
        return this.eventMode;
    }

    public GetMessagesRequest setFirstId(String firstId) {
        this.firstId = firstId;
        return this;
    }
    public String getFirstId() {
        return this.firstId;
    }

    public GetMessagesRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
