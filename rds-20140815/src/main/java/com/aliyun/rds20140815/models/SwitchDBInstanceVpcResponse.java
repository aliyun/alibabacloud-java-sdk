// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchDBInstanceVpcResponseBody body;

    public static SwitchDBInstanceVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceVpcResponse self = new SwitchDBInstanceVpcResponse();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchDBInstanceVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchDBInstanceVpcResponse setBody(SwitchDBInstanceVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchDBInstanceVpcResponseBody getBody() {
        return this.body;
    }

}
