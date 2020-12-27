// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsByNamePrefixResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatabaseObjectsByNamePrefixResponseBody body;

    public static GetDatabaseObjectsByNamePrefixResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsByNamePrefixResponse self = new GetDatabaseObjectsByNamePrefixResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsByNamePrefixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseObjectsByNamePrefixResponse setBody(GetDatabaseObjectsByNamePrefixResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseObjectsByNamePrefixResponseBody getBody() {
        return this.body;
    }

}
