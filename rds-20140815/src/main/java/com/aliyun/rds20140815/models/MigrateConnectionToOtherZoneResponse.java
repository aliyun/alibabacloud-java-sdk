// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateConnectionToOtherZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public MigrateConnectionToOtherZoneResponse setBody(MigrateConnectionToOtherZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateConnectionToOtherZoneResponseBody getBody() {
        return this.body;
    }

}
