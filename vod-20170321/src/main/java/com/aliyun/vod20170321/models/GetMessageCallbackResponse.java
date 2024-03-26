// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessageCallbackResponseBody body;

    public static GetMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCallbackResponse self = new GetMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageCallbackResponse setBody(GetMessageCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageCallbackResponseBody getBody() {
        return this.body;
    }

}
