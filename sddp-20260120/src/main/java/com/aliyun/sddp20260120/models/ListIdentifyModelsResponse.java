// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListIdentifyModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIdentifyModelsResponseBody body;

    public static ListIdentifyModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdentifyModelsResponse self = new ListIdentifyModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListIdentifyModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdentifyModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdentifyModelsResponse setBody(ListIdentifyModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIdentifyModelsResponseBody getBody() {
        return this.body;
    }

}
