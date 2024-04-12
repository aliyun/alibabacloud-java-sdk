// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AcceptApproveCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptApproveCommandResponseBody body;

    public static AcceptApproveCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptApproveCommandResponse self = new AcceptApproveCommandResponse();
        return TeaModel.build(map, self);
    }

    public AcceptApproveCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptApproveCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptApproveCommandResponse setBody(AcceptApproveCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptApproveCommandResponseBody getBody() {
        return this.body;
    }

}
