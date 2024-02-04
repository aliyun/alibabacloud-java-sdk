// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SwitchoverInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
