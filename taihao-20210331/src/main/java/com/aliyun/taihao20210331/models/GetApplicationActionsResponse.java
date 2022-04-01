// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetApplicationActionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationActionsResponseBody body;

    public static GetApplicationActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationActionsResponse self = new GetApplicationActionsResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationActionsResponse setBody(GetApplicationActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationActionsResponseBody getBody() {
        return this.body;
    }

}
