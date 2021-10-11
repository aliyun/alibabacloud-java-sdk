// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreReceiveConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateAiStoreReceiveConfigResponse setBody(CreateAiStoreReceiveConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiStoreReceiveConfigResponseBody getBody() {
        return this.body;
    }

}
