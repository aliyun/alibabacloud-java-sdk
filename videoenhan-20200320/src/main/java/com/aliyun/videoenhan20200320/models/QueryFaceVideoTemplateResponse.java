// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class QueryFaceVideoTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryFaceVideoTemplateResponse setBody(QueryFaceVideoTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceVideoTemplateResponseBody getBody() {
        return this.body;
    }

}
