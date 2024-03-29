// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationContextResponseBody extends TeaModel {
    @NameInMap("ConversationContext")
    public String conversationContext;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConversationContextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConversationContextResponseBody self = new DescribeConversationContextResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConversationContextResponseBody setConversationContext(String conversationContext) {
        this.conversationContext = conversationContext;
        return this;
    }
    public String getConversationContext() {
        return this.conversationContext;
    }

    public DescribeConversationContextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
