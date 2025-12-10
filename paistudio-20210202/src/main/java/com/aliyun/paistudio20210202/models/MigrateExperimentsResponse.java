// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public MigrateExperimentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateExperimentsResponse setBody(MigrateExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateExperimentsResponseBody getBody() {
        return this.body;
    }

}
