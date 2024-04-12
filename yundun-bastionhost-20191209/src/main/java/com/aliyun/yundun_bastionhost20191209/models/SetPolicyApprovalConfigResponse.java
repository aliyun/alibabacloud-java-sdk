// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyApprovalConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPolicyApprovalConfigResponseBody body;

    public static SetPolicyApprovalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyApprovalConfigResponse self = new SetPolicyApprovalConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetPolicyApprovalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPolicyApprovalConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPolicyApprovalConfigResponse setBody(SetPolicyApprovalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPolicyApprovalConfigResponseBody getBody() {
        return this.body;
    }

}
