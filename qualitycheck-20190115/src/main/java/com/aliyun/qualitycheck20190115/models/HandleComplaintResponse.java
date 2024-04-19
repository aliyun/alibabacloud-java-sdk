// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class HandleComplaintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandleComplaintResponseBody body;

    public static HandleComplaintResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleComplaintResponse self = new HandleComplaintResponse();
        return TeaModel.build(map, self);
    }

    public HandleComplaintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleComplaintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleComplaintResponse setBody(HandleComplaintResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleComplaintResponseBody getBody() {
        return this.body;
    }

}
