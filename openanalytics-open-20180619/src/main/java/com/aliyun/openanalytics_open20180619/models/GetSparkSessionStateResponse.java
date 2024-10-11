// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetSparkSessionStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkSessionStateResponseBody body;

    public static GetSparkSessionStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkSessionStateResponse self = new GetSparkSessionStateResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkSessionStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkSessionStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkSessionStateResponse setBody(GetSparkSessionStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkSessionStateResponseBody getBody() {
        return this.body;
    }

}
