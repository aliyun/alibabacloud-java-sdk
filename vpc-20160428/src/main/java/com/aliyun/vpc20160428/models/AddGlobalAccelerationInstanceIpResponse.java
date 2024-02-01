// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddGlobalAccelerationInstanceIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGlobalAccelerationInstanceIpResponseBody body;

    public static AddGlobalAccelerationInstanceIpResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGlobalAccelerationInstanceIpResponse self = new AddGlobalAccelerationInstanceIpResponse();
        return TeaModel.build(map, self);
    }

    public AddGlobalAccelerationInstanceIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGlobalAccelerationInstanceIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGlobalAccelerationInstanceIpResponse setBody(AddGlobalAccelerationInstanceIpResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGlobalAccelerationInstanceIpResponseBody getBody() {
        return this.body;
    }

}
