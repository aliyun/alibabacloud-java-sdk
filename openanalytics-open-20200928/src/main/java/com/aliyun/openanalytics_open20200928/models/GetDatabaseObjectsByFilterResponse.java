// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsByFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatabaseObjectsByFilterResponseBody body;

    public static GetDatabaseObjectsByFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsByFilterResponse self = new GetDatabaseObjectsByFilterResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsByFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseObjectsByFilterResponse setBody(GetDatabaseObjectsByFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseObjectsByFilterResponseBody getBody() {
        return this.body;
    }

}
