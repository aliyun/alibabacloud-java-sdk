// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendSearchRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrendSearchRecordResponseBody body;

    public static GetTrendSearchRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrendSearchRecordResponse self = new GetTrendSearchRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetTrendSearchRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrendSearchRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrendSearchRecordResponse setBody(GetTrendSearchRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrendSearchRecordResponseBody getBody() {
        return this.body;
    }

}
