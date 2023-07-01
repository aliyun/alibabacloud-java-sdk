// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientRatioStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClientRatioStatisticResponseBody body;

    public static GetClientRatioStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientRatioStatisticResponse self = new GetClientRatioStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetClientRatioStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientRatioStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientRatioStatisticResponse setBody(GetClientRatioStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientRatioStatisticResponseBody getBody() {
        return this.body;
    }

}
