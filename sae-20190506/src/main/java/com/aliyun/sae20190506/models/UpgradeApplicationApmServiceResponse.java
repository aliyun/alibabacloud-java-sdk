// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpgradeApplicationApmServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeApplicationApmServiceResponseBody body;

    public static UpgradeApplicationApmServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationApmServiceResponse self = new UpgradeApplicationApmServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationApmServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeApplicationApmServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeApplicationApmServiceResponse setBody(UpgradeApplicationApmServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeApplicationApmServiceResponseBody getBody() {
        return this.body;
    }

}
