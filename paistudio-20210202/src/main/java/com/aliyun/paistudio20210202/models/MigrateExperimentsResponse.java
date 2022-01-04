// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MigrateExperimentsResponseBody body;

    public static MigrateExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateExperimentsResponse self = new MigrateExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public MigrateExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateExperimentsResponse setBody(MigrateExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateExperimentsResponseBody getBody() {
        return this.body;
    }

}
