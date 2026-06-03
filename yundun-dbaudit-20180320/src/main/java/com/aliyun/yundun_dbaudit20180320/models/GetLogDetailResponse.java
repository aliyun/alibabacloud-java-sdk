// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogDetailResponseBody body;

    public static GetLogDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogDetailResponse self = new GetLogDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetLogDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogDetailResponse setBody(GetLogDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogDetailResponseBody getBody() {
        return this.body;
    }

}
