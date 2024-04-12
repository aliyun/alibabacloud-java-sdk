// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RejectApproveCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectApproveCommandResponseBody body;

    public static RejectApproveCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectApproveCommandResponse self = new RejectApproveCommandResponse();
        return TeaModel.build(map, self);
    }

    public RejectApproveCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectApproveCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectApproveCommandResponse setBody(RejectApproveCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectApproveCommandResponseBody getBody() {
        return this.body;
    }

}
