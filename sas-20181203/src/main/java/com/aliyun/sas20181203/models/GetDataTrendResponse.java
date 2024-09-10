// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDataTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataTrendResponseBody body;

    public static GetDataTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrendResponse self = new GetDataTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetDataTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataTrendResponse setBody(GetDataTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataTrendResponseBody getBody() {
        return this.body;
    }

}
