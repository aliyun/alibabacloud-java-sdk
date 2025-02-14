// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDockerhubImageRiskStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDockerhubImageRiskStatisticResponseBody body;

    public static GetDockerhubImageRiskStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDockerhubImageRiskStatisticResponse self = new GetDockerhubImageRiskStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetDockerhubImageRiskStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDockerhubImageRiskStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDockerhubImageRiskStatisticResponse setBody(GetDockerhubImageRiskStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDockerhubImageRiskStatisticResponseBody getBody() {
        return this.body;
    }

}
