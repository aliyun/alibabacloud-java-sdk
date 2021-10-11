// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreUserTaskByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAiStoreUserTaskByNameResponseBody body;

    public static GetAiStoreUserTaskByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreUserTaskByNameResponse self = new GetAiStoreUserTaskByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetAiStoreUserTaskByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiStoreUserTaskByNameResponse setBody(GetAiStoreUserTaskByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiStoreUserTaskByNameResponseBody getBody() {
        return this.body;
    }

}
