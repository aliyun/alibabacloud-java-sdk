// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PurgeDBInstanceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurgeDBInstanceLogResponseBody body;

    public static PurgeDBInstanceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        PurgeDBInstanceLogResponse self = new PurgeDBInstanceLogResponse();
        return TeaModel.build(map, self);
    }

    public PurgeDBInstanceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurgeDBInstanceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PurgeDBInstanceLogResponse setBody(PurgeDBInstanceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public PurgeDBInstanceLogResponseBody getBody() {
        return this.body;
    }

}
