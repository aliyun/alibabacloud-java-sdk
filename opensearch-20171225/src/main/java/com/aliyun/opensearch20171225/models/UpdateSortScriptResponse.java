// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSortScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSortScriptResponseBody body;

    public static UpdateSortScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSortScriptResponse self = new UpdateSortScriptResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSortScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSortScriptResponse setBody(UpdateSortScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSortScriptResponseBody getBody() {
        return this.body;
    }

}
