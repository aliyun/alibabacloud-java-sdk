// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetResourceTypeResponseBody body;

    public static SetResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetResourceTypeResponse self = new SetResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public SetResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetResourceTypeResponse setBody(SetResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetResourceTypeResponseBody getBody() {
        return this.body;
    }

}
