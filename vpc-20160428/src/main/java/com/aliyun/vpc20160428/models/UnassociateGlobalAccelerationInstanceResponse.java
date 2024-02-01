// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateGlobalAccelerationInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassociateGlobalAccelerationInstanceResponseBody body;

    public static UnassociateGlobalAccelerationInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateGlobalAccelerationInstanceResponse self = new UnassociateGlobalAccelerationInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateGlobalAccelerationInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateGlobalAccelerationInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassociateGlobalAccelerationInstanceResponse setBody(UnassociateGlobalAccelerationInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateGlobalAccelerationInstanceResponseBody getBody() {
        return this.body;
    }

}
