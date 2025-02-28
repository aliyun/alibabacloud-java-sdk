// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RenewRCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewRCInstanceResponseBody body;

    public static RenewRCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewRCInstanceResponse self = new RenewRCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewRCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewRCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewRCInstanceResponse setBody(RenewRCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewRCInstanceResponseBody getBody() {
        return this.body;
    }

}
