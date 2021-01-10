// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SendLinkeBahamutFlowtasknoticeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendLinkeBahamutFlowtasknoticeResponseBody body;

    public static SendLinkeBahamutFlowtasknoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendLinkeBahamutFlowtasknoticeResponse self = new SendLinkeBahamutFlowtasknoticeResponse();
        return TeaModel.build(map, self);
    }

    public SendLinkeBahamutFlowtasknoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendLinkeBahamutFlowtasknoticeResponse setBody(SendLinkeBahamutFlowtasknoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendLinkeBahamutFlowtasknoticeResponseBody getBody() {
        return this.body;
    }

}
