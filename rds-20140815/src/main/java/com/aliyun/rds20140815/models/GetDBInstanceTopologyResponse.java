// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDBInstanceTopologyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDBInstanceTopologyResponseBody body;

    public static GetDBInstanceTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDBInstanceTopologyResponse self = new GetDBInstanceTopologyResponse();
        return TeaModel.build(map, self);
    }

    public GetDBInstanceTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDBInstanceTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDBInstanceTopologyResponse setBody(GetDBInstanceTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDBInstanceTopologyResponseBody getBody() {
        return this.body;
    }

}
