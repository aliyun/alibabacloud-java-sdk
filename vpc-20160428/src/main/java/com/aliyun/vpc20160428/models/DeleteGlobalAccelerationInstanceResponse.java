// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteGlobalAccelerationInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGlobalAccelerationInstanceResponseBody body;

    public static DeleteGlobalAccelerationInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalAccelerationInstanceResponse self = new DeleteGlobalAccelerationInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalAccelerationInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGlobalAccelerationInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGlobalAccelerationInstanceResponse setBody(DeleteGlobalAccelerationInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGlobalAccelerationInstanceResponseBody getBody() {
        return this.body;
    }

}
