// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SwitchoverInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchoverInstanceResponseBody body;

    public static SwitchoverInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchoverInstanceResponse self = new SwitchoverInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SwitchoverInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchoverInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchoverInstanceResponse setBody(SwitchoverInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchoverInstanceResponseBody getBody() {
        return this.body;
    }

}
