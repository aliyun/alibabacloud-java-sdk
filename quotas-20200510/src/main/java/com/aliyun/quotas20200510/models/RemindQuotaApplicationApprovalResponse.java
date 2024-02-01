// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class RemindQuotaApplicationApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemindQuotaApplicationApprovalResponseBody body;

    public static RemindQuotaApplicationApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        RemindQuotaApplicationApprovalResponse self = new RemindQuotaApplicationApprovalResponse();
        return TeaModel.build(map, self);
    }

    public RemindQuotaApplicationApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemindQuotaApplicationApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemindQuotaApplicationApprovalResponse setBody(RemindQuotaApplicationApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public RemindQuotaApplicationApprovalResponseBody getBody() {
        return this.body;
    }

}
