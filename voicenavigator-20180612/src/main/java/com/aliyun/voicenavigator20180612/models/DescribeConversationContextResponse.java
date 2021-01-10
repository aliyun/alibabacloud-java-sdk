// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationContextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConversationContextResponseBody body;

    public static DescribeConversationContextResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConversationContextResponse self = new DescribeConversationContextResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConversationContextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConversationContextResponse setBody(DescribeConversationContextResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConversationContextResponseBody getBody() {
        return this.body;
    }

}
