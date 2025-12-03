// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetMessagesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-iBuGU1VxEY42zrQRQfNA****</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <strong>example:</strong>
     * <p>941c6f59-acf5-4e11-9adc-31e52e1f****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>038866af-a050-4bc5-bfad-b7bfc838****</p>
     */
    @NameInMap("FirstId")
    public String firstId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    public static GetMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessagesRequest self = new GetMessagesRequest();
        return TeaModel.build(map, self);
    }

    public GetMessagesRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public GetMessagesRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
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
