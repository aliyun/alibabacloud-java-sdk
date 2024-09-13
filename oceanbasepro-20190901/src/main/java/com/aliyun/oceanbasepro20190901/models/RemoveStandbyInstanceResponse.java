// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class RemoveStandbyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveStandbyInstanceResponseBody body;

    public static RemoveStandbyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveStandbyInstanceResponse self = new RemoveStandbyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveStandbyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveStandbyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveStandbyInstanceResponse setBody(RemoveStandbyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveStandbyInstanceResponseBody getBody() {
        return this.body;
    }

}
