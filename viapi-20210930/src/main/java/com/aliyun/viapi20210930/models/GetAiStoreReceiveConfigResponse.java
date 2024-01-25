// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreReceiveConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiStoreReceiveConfigResponseBody body;

    public static GetAiStoreReceiveConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreReceiveConfigResponse self = new GetAiStoreReceiveConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAiStoreReceiveConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiStoreReceiveConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiStoreReceiveConfigResponse setBody(GetAiStoreReceiveConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiStoreReceiveConfigResponseBody getBody() {
        return this.body;
    }

}
