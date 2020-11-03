// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableObjectsByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTableObjectsByNameResponseBody body;

    public static GetTableObjectsByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsByNameResponse self = new GetTableObjectsByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableObjectsByNameResponse setBody(GetTableObjectsByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableObjectsByNameResponseBody getBody() {
        return this.body;
    }

}
