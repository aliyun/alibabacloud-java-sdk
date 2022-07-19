// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeCasComputersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasComputersResponseBody body;

    public static DescribeCasComputersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasComputersResponse self = new DescribeCasComputersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasComputersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasComputersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCasComputersResponse setBody(DescribeCasComputersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasComputersResponseBody getBody() {
        return this.body;
    }

}
