// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class MigrateResourceUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MigrateResourceUnitResponseBody body;

    public static MigrateResourceUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateResourceUnitResponse self = new MigrateResourceUnitResponse();
        return TeaModel.build(map, self);
    }

    public MigrateResourceUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateResourceUnitResponse setBody(MigrateResourceUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateResourceUnitResponseBody getBody() {
        return this.body;
    }

}
