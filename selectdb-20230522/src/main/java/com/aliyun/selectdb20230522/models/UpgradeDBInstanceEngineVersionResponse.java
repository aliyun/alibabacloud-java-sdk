// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceEngineVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeDBInstanceEngineVersionResponseBody body;

    public static UpgradeDBInstanceEngineVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceEngineVersionResponse self = new UpgradeDBInstanceEngineVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceEngineVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBInstanceEngineVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeDBInstanceEngineVersionResponse setBody(UpgradeDBInstanceEngineVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBInstanceEngineVersionResponseBody getBody() {
        return this.body;
    }

}
