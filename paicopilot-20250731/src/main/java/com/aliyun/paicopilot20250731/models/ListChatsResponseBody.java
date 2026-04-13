// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class ListChatsResponseBody extends TeaModel {
    @NameInMap("Chats")
    public java.util.List<Chat> chats;

    /**
     * <strong>example:</strong>
     * <p>44553E9A-******-37ADC33FE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListChatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatsResponseBody self = new ListChatsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatsResponseBody setChats(java.util.List<Chat> chats) {
        this.chats = chats;
        return this;
    }
    public java.util.List<Chat> getChats() {
        return this.chats;
    }

    public ListChatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
