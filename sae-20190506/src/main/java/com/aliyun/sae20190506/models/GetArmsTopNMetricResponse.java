// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetArmsTopNMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArmsTopNMetricResponseBody body;

    public static GetArmsTopNMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArmsTopNMetricResponse self = new GetArmsTopNMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetArmsTopNMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArmsTopNMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArmsTopNMetricResponse setBody(GetArmsTopNMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArmsTopNMetricResponseBody getBody() {
        return this.body;
    }

}
