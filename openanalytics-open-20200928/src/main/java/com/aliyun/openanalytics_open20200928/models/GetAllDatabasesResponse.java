// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetAllDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllDatabasesResponseBody body;

    public static GetAllDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllDatabasesResponse self = new GetAllDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public GetAllDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllDatabasesResponse setBody(GetAllDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllDatabasesResponseBody getBody() {
        return this.body;
    }

}
