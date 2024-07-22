// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationContextResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{         &quot;CallingNumber&quot;: &quot;135815***&quot;,         &quot;AdditionalContext&quot;: &quot;&quot;,         &quot;ConversationId&quot;: &quot;361c8a53-0e29-42f3-8aa7-c7752d010399&quot;     }</p>
     */
    @NameInMap("ConversationContext")
    public String conversationContext;

    /**
     * <strong>example:</strong>
     * <p>b19af5ce5314ac08108d1b33fe20e15</p>
     */
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
