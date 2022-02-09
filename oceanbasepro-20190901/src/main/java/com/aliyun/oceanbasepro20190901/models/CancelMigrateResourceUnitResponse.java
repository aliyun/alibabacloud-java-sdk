// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CancelMigrateResourceUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelMigrateResourceUnitResponseBody body;

    public static CancelMigrateResourceUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMigrateResourceUnitResponse self = new CancelMigrateResourceUnitResponse();
        return TeaModel.build(map, self);
    }

    public CancelMigrateResourceUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelMigrateResourceUnitResponse setBody(CancelMigrateResourceUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelMigrateResourceUnitResponseBody getBody() {
        return this.body;
    }

}
