// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatabaseTagsResponseBody body;

    public static GetDatabaseTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseTagsResponse self = new GetDatabaseTagsResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseTagsResponse setBody(GetDatabaseTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseTagsResponseBody getBody() {
        return this.body;
    }

}
