// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDTXAppsRecoveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDTXAppsRecoveryResponseBody body;

    public static DeleteDTXAppsRecoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDTXAppsRecoveryResponse self = new DeleteDTXAppsRecoveryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDTXAppsRecoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDTXAppsRecoveryResponse setBody(DeleteDTXAppsRecoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDTXAppsRecoveryResponseBody getBody() {
        return this.body;
    }

}
