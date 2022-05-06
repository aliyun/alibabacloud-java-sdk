// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ActivateMigrationTargetInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivateMigrationTargetInstanceResponseBody body;

    public static ActivateMigrationTargetInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateMigrationTargetInstanceResponse self = new ActivateMigrationTargetInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ActivateMigrationTargetInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateMigrationTargetInstanceResponse setBody(ActivateMigrationTargetInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateMigrationTargetInstanceResponseBody getBody() {
        return this.body;
    }

}
