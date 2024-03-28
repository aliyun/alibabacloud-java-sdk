// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCertsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCertsResponseBody body;

    public static DescribeCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertsResponse self = new DescribeCertsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCertsResponse setBody(DescribeCertsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertsResponseBody getBody() {
        return this.body;
    }

}
