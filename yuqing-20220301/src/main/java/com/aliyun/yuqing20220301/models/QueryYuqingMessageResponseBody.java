// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class QueryYuqingMessageResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("yuqingMessages")
    public java.util.List<YuqingMessage> yuqingMessages;

    public static QueryYuqingMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryYuqingMessageResponseBody self = new QueryYuqingMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryYuqingMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryYuqingMessageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryYuqingMessageResponseBody setYuqingMessages(java.util.List<YuqingMessage> yuqingMessages) {
        this.yuqingMessages = yuqingMessages;
        return this;
    }
    public java.util.List<YuqingMessage> getYuqingMessages() {
        return this.yuqingMessages;
    }

}
