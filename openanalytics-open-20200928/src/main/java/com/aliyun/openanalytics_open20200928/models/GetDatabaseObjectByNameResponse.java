// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatabaseObjectByNameResponseBody body;

    public static GetDatabaseObjectByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectByNameResponse self = new GetDatabaseObjectByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseObjectByNameResponse setBody(GetDatabaseObjectByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseObjectByNameResponseBody getBody() {
        return this.body;
    }

}
