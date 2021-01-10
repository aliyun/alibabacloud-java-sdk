// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDmsWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDmsWhitelistResponseBody body;

    public static DeleteDmsWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDmsWhitelistResponse self = new DeleteDmsWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDmsWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDmsWhitelistResponse setBody(DeleteDmsWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDmsWhitelistResponseBody getBody() {
        return this.body;
    }

}
