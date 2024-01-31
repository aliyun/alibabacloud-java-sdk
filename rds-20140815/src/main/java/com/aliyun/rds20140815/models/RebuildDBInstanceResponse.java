// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebuildDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RebuildDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebuildDBInstanceResponse setBody(RebuildDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebuildDBInstanceResponseBody getBody() {
        return this.body;
    }

}
