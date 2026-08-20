// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RecommendNextActionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecommendNextActionsResponseBody body;

    public static RecommendNextActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        RecommendNextActionsResponse self = new RecommendNextActionsResponse();
        return TeaModel.build(map, self);
    }

    public RecommendNextActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecommendNextActionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecommendNextActionsResponse setBody(RecommendNextActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public RecommendNextActionsResponseBody getBody() {
        return this.body;
    }

}
