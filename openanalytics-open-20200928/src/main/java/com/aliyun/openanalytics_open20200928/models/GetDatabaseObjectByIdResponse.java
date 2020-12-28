// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatabaseObjectByIdResponseBody body;

    public static GetDatabaseObjectByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectByIdResponse self = new GetDatabaseObjectByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseObjectByIdResponse setBody(GetDatabaseObjectByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseObjectByIdResponseBody getBody() {
        return this.body;
    }

}
