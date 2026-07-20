// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetCompliancePackIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCompliancePackIdResponseBody body;

    public static GetCompliancePackIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackIdResponse self = new GetCompliancePackIdResponse();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompliancePackIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCompliancePackIdResponse setBody(GetCompliancePackIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompliancePackIdResponseBody getBody() {
        return this.body;
    }

}
