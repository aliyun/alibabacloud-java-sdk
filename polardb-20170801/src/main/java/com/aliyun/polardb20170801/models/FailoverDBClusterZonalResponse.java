// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class FailoverDBClusterZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FailoverDBClusterZonalResponseBody body;

    public static FailoverDBClusterZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        FailoverDBClusterZonalResponse self = new FailoverDBClusterZonalResponse();
        return TeaModel.build(map, self);
    }

    public FailoverDBClusterZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FailoverDBClusterZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FailoverDBClusterZonalResponse setBody(FailoverDBClusterZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public FailoverDBClusterZonalResponseBody getBody() {
        return this.body;
    }

}
