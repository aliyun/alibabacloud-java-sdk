// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBProxyInstanceKernelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeDBProxyInstanceKernelVersionResponseBody body;

    public static UpgradeDBProxyInstanceKernelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBProxyInstanceKernelVersionResponse self = new UpgradeDBProxyInstanceKernelVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBProxyInstanceKernelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBProxyInstanceKernelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeDBProxyInstanceKernelVersionResponse setBody(UpgradeDBProxyInstanceKernelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBProxyInstanceKernelVersionResponseBody getBody() {
        return this.body;
    }

}
