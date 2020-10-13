// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AlterDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AlterDatabaseResponseBody body;

    public static AlterDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        AlterDatabaseResponse self = new AlterDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public AlterDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlterDatabaseResponse setBody(AlterDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public AlterDatabaseResponseBody getBody() {
        return this.body;
    }

}
