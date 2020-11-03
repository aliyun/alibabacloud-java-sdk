// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatabaseObjectsResponseBody body;

    public static GetDatabaseObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsResponse self = new GetDatabaseObjectsResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseObjectsResponse setBody(GetDatabaseObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseObjectsResponseBody getBody() {
        return this.body;
    }

}
