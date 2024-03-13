// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class QueryFaceVideoTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceVideoTemplateResponseBody body;

    public static QueryFaceVideoTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceVideoTemplateResponse self = new QueryFaceVideoTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceVideoTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceVideoTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceVideoTemplateResponse setBody(QueryFaceVideoTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceVideoTemplateResponseBody getBody() {
        return this.body;
    }

}
