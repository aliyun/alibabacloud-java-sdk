// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemRunSummariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkItemRunSummariesResponseBody body;

    public static GetWorkItemRunSummariesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemRunSummariesResponse self = new GetWorkItemRunSummariesResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkItemRunSummariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkItemRunSummariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkItemRunSummariesResponse setBody(GetWorkItemRunSummariesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkItemRunSummariesResponseBody getBody() {
        return this.body;
    }

}
