// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMaterializedViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMaterializedViewResponseBody body;

    public static GetMaterializedViewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaterializedViewResponse self = new GetMaterializedViewResponse();
        return TeaModel.build(map, self);
    }

    public GetMaterializedViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMaterializedViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMaterializedViewResponse setBody(GetMaterializedViewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMaterializedViewResponseBody getBody() {
        return this.body;
    }

}
