// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RunRCInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunRCInstancesResponseBody body;

    public static RunRCInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RunRCInstancesResponse self = new RunRCInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RunRCInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunRCInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunRCInstancesResponse setBody(RunRCInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RunRCInstancesResponseBody getBody() {
        return this.body;
    }

}
