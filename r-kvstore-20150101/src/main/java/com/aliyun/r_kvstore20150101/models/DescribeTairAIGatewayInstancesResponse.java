// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairAIGatewayInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairAIGatewayInstancesResponseBody body;

    public static DescribeTairAIGatewayInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairAIGatewayInstancesResponse self = new DescribeTairAIGatewayInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairAIGatewayInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairAIGatewayInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairAIGatewayInstancesResponse setBody(DescribeTairAIGatewayInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairAIGatewayInstancesResponseBody getBody() {
        return this.body;
    }

}
