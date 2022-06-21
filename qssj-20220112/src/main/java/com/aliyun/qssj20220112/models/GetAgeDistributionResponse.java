// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetAgeDistributionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgeDistributionResponseBody body;

    public static GetAgeDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgeDistributionResponse self = new GetAgeDistributionResponse();
        return TeaModel.build(map, self);
    }

    public GetAgeDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgeDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgeDistributionResponse setBody(GetAgeDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgeDistributionResponseBody getBody() {
        return this.body;
    }

}
