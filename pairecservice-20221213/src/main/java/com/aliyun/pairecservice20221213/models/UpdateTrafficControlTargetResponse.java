// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrafficControlTargetResponseBody body;

    public static UpdateTrafficControlTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficControlTargetResponse self = new UpdateTrafficControlTargetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficControlTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrafficControlTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrafficControlTargetResponse setBody(UpdateTrafficControlTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrafficControlTargetResponseBody getBody() {
        return this.body;
    }

}
