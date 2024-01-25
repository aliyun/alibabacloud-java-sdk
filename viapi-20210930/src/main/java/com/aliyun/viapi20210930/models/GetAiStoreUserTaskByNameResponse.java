// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreUserTaskByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetAiStoreUserTaskByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiStoreUserTaskByNameResponse setBody(GetAiStoreUserTaskByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiStoreUserTaskByNameResponseBody getBody() {
        return this.body;
    }

}
