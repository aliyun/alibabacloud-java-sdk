// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetListRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetListRecordResponseBody body;

    public static GetListRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetListRecordResponse self = new GetListRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetListRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetListRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetListRecordResponse setBody(GetListRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetListRecordResponseBody getBody() {
        return this.body;
    }

}
