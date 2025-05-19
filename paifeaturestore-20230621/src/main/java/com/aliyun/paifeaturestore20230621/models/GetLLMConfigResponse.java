// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetLLMConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLLMConfigResponseBody body;

    public static GetLLMConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLLMConfigResponse self = new GetLLMConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLLMConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLLMConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLLMConfigResponse setBody(GetLLMConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLLMConfigResponseBody getBody() {
        return this.body;
    }

}
