// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDBInstanceTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetDBInstanceTopologyResponse setBody(GetDBInstanceTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDBInstanceTopologyResponseBody getBody() {
        return this.body;
    }

}
