// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsByNameAndTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatabaseObjectsByNameAndTagsResponseBody body;

    public static GetDatabaseObjectsByNameAndTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsByNameAndTagsResponse self = new GetDatabaseObjectsByNameAndTagsResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsByNameAndTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseObjectsByNameAndTagsResponse setBody(GetDatabaseObjectsByNameAndTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseObjectsByNameAndTagsResponseBody getBody() {
        return this.body;
    }

}
