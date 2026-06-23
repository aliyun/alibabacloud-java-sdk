// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RejectOperationTaskApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectOperationTaskApprovalResponseBody body;

    public static RejectOperationTaskApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectOperationTaskApprovalResponse self = new RejectOperationTaskApprovalResponse();
        return TeaModel.build(map, self);
    }

    public RejectOperationTaskApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectOperationTaskApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectOperationTaskApprovalResponse setBody(RejectOperationTaskApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectOperationTaskApprovalResponseBody getBody() {
        return this.body;
    }

}
