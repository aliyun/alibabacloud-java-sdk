// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDTXAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDTXAppsResponseBody body;

    public static DeleteDTXAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDTXAppsResponse self = new DeleteDTXAppsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDTXAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDTXAppsResponse setBody(DeleteDTXAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDTXAppsResponseBody getBody() {
        return this.body;
    }

}
