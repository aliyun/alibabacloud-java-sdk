// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreReceiveConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAiStoreReceiveConfigResponseBody body;

    public static CreateAiStoreReceiveConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreReceiveConfigResponse self = new CreateAiStoreReceiveConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreReceiveConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiStoreReceiveConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAiStoreReceiveConfigResponse setBody(CreateAiStoreReceiveConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiStoreReceiveConfigResponseBody getBody() {
        return this.body;
    }

}
