// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebuildDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebuildDBInstanceResponseBody body;

    public static RebuildDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebuildDBInstanceResponse self = new RebuildDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebuildDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebuildDBInstanceResponse setBody(RebuildDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebuildDBInstanceResponseBody getBody() {
        return this.body;
    }

}
