// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopRCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRCInstanceResponseBody body;

    public static StopRCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRCInstanceResponse self = new StopRCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopRCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRCInstanceResponse setBody(StopRCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRCInstanceResponseBody getBody() {
        return this.body;
    }

}
