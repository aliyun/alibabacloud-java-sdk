// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PurgeDBInstanceLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PurgeDBInstanceLogResponse setBody(PurgeDBInstanceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public PurgeDBInstanceLogResponseBody getBody() {
        return this.body;
    }

}
