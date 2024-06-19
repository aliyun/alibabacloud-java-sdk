// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeDBInstanceKernelVersionResponseBody body;

    public static UpgradeDBInstanceKernelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceKernelVersionResponse self = new UpgradeDBInstanceKernelVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceKernelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBInstanceKernelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeDBInstanceKernelVersionResponse setBody(UpgradeDBInstanceKernelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBInstanceKernelVersionResponseBody getBody() {
        return this.body;
    }

}
