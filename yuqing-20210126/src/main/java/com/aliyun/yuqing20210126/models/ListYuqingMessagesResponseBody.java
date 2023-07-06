// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ListYuqingMessagesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("yuqingMessages")
    public java.util.List<YuqingMessage> yuqingMessages;

    public static ListYuqingMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListYuqingMessagesResponseBody self = new ListYuqingMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListYuqingMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListYuqingMessagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListYuqingMessagesResponseBody setYuqingMessages(java.util.List<YuqingMessage> yuqingMessages) {
        this.yuqingMessages = yuqingMessages;
        return this;
    }
    public java.util.List<YuqingMessage> getYuqingMessages() {
        return this.yuqingMessages;
    }

}
