// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairAIGatewayParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairAIGatewayParametersResponseBody body;

    public static DescribeTairAIGatewayParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairAIGatewayParametersResponse self = new DescribeTairAIGatewayParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairAIGatewayParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairAIGatewayParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairAIGatewayParametersResponse setBody(DescribeTairAIGatewayParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairAIGatewayParametersResponseBody getBody() {
        return this.body;
    }

}
