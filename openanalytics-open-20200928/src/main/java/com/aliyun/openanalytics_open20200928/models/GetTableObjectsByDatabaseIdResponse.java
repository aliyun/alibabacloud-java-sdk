// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableObjectsByDatabaseIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTableObjectsByDatabaseIdResponseBody body;

    public static GetTableObjectsByDatabaseIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsByDatabaseIdResponse self = new GetTableObjectsByDatabaseIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsByDatabaseIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableObjectsByDatabaseIdResponse setBody(GetTableObjectsByDatabaseIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableObjectsByDatabaseIdResponseBody getBody() {
        return this.body;
    }

}
