// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetGraphDraftAssembledResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGraphDraftAssembledResponseBody body;

    public static GetGraphDraftAssembledResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGraphDraftAssembledResponse self = new GetGraphDraftAssembledResponse();
        return TeaModel.build(map, self);
    }

    public GetGraphDraftAssembledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGraphDraftAssembledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGraphDraftAssembledResponse setBody(GetGraphDraftAssembledResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGraphDraftAssembledResponseBody getBody() {
        return this.body;
    }

}
