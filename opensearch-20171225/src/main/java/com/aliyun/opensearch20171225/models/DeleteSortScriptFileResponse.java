// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteSortScriptFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSortScriptFileResponseBody body;

    public static DeleteSortScriptFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSortScriptFileResponse self = new DeleteSortScriptFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSortScriptFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSortScriptFileResponse setBody(DeleteSortScriptFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSortScriptFileResponseBody getBody() {
        return this.body;
    }

}
