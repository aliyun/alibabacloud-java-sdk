// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetVServerGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetVServerGroupAttributeResponseBody body;

    public static SetVServerGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetVServerGroupAttributeResponse self = new SetVServerGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetVServerGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetVServerGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetVServerGroupAttributeResponse setBody(SetVServerGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetVServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
