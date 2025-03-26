// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartRCInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRCInstancesResponseBody body;

    public static StartRCInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRCInstancesResponse self = new StartRCInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StartRCInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRCInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRCInstancesResponse setBody(StartRCInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRCInstancesResponseBody getBody() {
        return this.body;
    }

}
