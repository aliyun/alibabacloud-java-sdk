// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetChatModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatModelResponseBody body;

    public static GetChatModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatModelResponse self = new GetChatModelResponse();
        return TeaModel.build(map, self);
    }

    public GetChatModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatModelResponse setBody(GetChatModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatModelResponseBody getBody() {
        return this.body;
    }

}
