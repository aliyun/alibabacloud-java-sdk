// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceNetTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchDBInstanceNetTypeResponseBody body;

    public static SwitchDBInstanceNetTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceNetTypeResponse self = new SwitchDBInstanceNetTypeResponse();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceNetTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchDBInstanceNetTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchDBInstanceNetTypeResponse setBody(SwitchDBInstanceNetTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchDBInstanceNetTypeResponseBody getBody() {
        return this.body;
    }

}
