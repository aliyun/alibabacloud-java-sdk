// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartRCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRCInstanceResponseBody body;

    public static StartRCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRCInstanceResponse self = new StartRCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartRCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRCInstanceResponse setBody(StartRCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRCInstanceResponseBody getBody() {
        return this.body;
    }

}
