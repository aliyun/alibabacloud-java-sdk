// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCCMVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCCMVersionResponseBody body;

    public static DescribeCCMVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCCMVersionResponse self = new DescribeCCMVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCCMVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCCMVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCCMVersionResponse setBody(DescribeCCMVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCCMVersionResponseBody getBody() {
        return this.body;
    }

}
