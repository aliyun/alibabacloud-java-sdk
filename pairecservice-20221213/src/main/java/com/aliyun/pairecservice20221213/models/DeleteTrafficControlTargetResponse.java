// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrafficControlTargetResponseBody body;

    public static DeleteTrafficControlTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlTargetResponse self = new DeleteTrafficControlTargetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficControlTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrafficControlTargetResponse setBody(DeleteTrafficControlTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficControlTargetResponseBody getBody() {
        return this.body;
    }

}
