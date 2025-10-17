// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterVersionZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeDBClusterVersionZonalResponseBody body;

    public static UpgradeDBClusterVersionZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBClusterVersionZonalResponse self = new UpgradeDBClusterVersionZonalResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBClusterVersionZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBClusterVersionZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeDBClusterVersionZonalResponse setBody(UpgradeDBClusterVersionZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBClusterVersionZonalResponseBody getBody() {
        return this.body;
    }

}
