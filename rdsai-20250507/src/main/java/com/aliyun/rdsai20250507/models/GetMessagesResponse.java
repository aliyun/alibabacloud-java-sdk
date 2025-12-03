// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessagesResponseBody body;

    public static GetMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessagesResponse self = new GetMessagesResponse();
        return TeaModel.build(map, self);
    }

    public GetMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessagesResponse setBody(GetMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessagesResponseBody getBody() {
        return this.body;
    }

}
