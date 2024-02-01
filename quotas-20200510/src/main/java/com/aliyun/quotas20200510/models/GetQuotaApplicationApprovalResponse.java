// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQuotaApplicationApprovalResponseBody body;

    public static GetQuotaApplicationApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaApplicationApprovalResponse self = new GetQuotaApplicationApprovalResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaApplicationApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaApplicationApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaApplicationApprovalResponse setBody(GetQuotaApplicationApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaApplicationApprovalResponseBody getBody() {
        return this.body;
    }

}
