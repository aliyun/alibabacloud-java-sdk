// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetAllTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllTablesResponseBody body;

    public static GetAllTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllTablesResponse self = new GetAllTablesResponse();
        return TeaModel.build(map, self);
    }

    public GetAllTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllTablesResponse setBody(GetAllTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllTablesResponseBody getBody() {
        return this.body;
    }

}
