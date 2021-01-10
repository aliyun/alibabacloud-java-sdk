// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDTXAppsActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDTXAppsActionResponseBody body;

    public static DeleteDTXAppsActionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDTXAppsActionResponse self = new DeleteDTXAppsActionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDTXAppsActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDTXAppsActionResponse setBody(DeleteDTXAppsActionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDTXAppsActionResponseBody getBody() {
        return this.body;
    }

}
