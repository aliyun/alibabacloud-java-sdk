// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListNluModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNluModelsResponseBody body;

    public static ListNluModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNluModelsResponse self = new ListNluModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListNluModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNluModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNluModelsResponse setBody(ListNluModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNluModelsResponseBody getBody() {
        return this.body;
    }

}
