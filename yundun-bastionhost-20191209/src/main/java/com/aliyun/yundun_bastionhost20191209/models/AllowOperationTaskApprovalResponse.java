// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AllowOperationTaskApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllowOperationTaskApprovalResponseBody body;

    public static AllowOperationTaskApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        AllowOperationTaskApprovalResponse self = new AllowOperationTaskApprovalResponse();
        return TeaModel.build(map, self);
    }

    public AllowOperationTaskApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllowOperationTaskApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllowOperationTaskApprovalResponse setBody(AllowOperationTaskApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public AllowOperationTaskApprovalResponseBody getBody() {
        return this.body;
    }

}
