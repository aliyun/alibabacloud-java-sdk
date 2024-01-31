// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateConnectionToOtherZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateConnectionToOtherZoneResponseBody body;

    public static MigrateConnectionToOtherZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateConnectionToOtherZoneResponse self = new MigrateConnectionToOtherZoneResponse();
        return TeaModel.build(map, self);
    }

    public MigrateConnectionToOtherZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateConnectionToOtherZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateConnectionToOtherZoneResponse setBody(MigrateConnectionToOtherZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateConnectionToOtherZoneResponseBody getBody() {
        return this.body;
    }

}
