// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDockerhubImageRiskRankInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDockerhubImageRiskRankInfoResponseBody body;

    public static GetDockerhubImageRiskRankInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDockerhubImageRiskRankInfoResponse self = new GetDockerhubImageRiskRankInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDockerhubImageRiskRankInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDockerhubImageRiskRankInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDockerhubImageRiskRankInfoResponse setBody(GetDockerhubImageRiskRankInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDockerhubImageRiskRankInfoResponseBody getBody() {
        return this.body;
    }

}
