// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DowngradeApplicationApmServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DowngradeApplicationApmServiceResponseBody body;

    public static DowngradeApplicationApmServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DowngradeApplicationApmServiceResponse self = new DowngradeApplicationApmServiceResponse();
        return TeaModel.build(map, self);
    }

    public DowngradeApplicationApmServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DowngradeApplicationApmServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DowngradeApplicationApmServiceResponse setBody(DowngradeApplicationApmServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DowngradeApplicationApmServiceResponseBody getBody() {
        return this.body;
    }

}
