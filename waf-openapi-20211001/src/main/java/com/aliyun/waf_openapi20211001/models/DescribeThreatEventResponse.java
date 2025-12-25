// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeThreatEventResponseBody body;

    public static DescribeThreatEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeThreatEventResponse self = new DescribeThreatEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeThreatEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeThreatEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeThreatEventResponse setBody(DescribeThreatEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeThreatEventResponseBody getBody() {
        return this.body;
    }

}
