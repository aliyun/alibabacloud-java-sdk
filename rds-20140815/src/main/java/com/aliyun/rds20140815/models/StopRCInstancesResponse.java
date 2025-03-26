// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopRCInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRCInstancesResponseBody body;

    public static StopRCInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRCInstancesResponse self = new StopRCInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StopRCInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRCInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRCInstancesResponse setBody(StopRCInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRCInstancesResponseBody getBody() {
        return this.body;
    }

}
