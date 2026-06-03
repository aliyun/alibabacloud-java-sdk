// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogListResponseBody body;

    public static GetLogListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogListResponse self = new GetLogListResponse();
        return TeaModel.build(map, self);
    }

    public GetLogListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogListResponse setBody(GetLogListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogListResponseBody getBody() {
        return this.body;
    }

}
