// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationContextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeConversationContextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConversationContextResponse setBody(DescribeConversationContextResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConversationContextResponseBody getBody() {
        return this.body;
    }

}
