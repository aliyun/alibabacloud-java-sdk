// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConversationResponseBody body;

    public static DescribeConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConversationResponse self = new DescribeConversationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConversationResponse setBody(DescribeConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConversationResponseBody getBody() {
        return this.body;
    }

}
