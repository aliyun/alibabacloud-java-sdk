// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceDeploySchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeDBInstanceDeploySchemeResponseBody body;

    public static UpgradeDBInstanceDeploySchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceDeploySchemeResponse self = new UpgradeDBInstanceDeploySchemeResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceDeploySchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBInstanceDeploySchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeDBInstanceDeploySchemeResponse setBody(UpgradeDBInstanceDeploySchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBInstanceDeploySchemeResponseBody getBody() {
        return this.body;
    }

}
