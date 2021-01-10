// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeConversationResponse setBody(DescribeConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConversationResponseBody getBody() {
        return this.body;
    }

}
