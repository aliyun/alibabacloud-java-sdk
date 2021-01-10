// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteCustomizationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCustomizationConfigResponseBody body;

    public static DeleteCustomizationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizationConfigResponse self = new DeleteCustomizationConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomizationConfigResponse setBody(DeleteCustomizationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomizationConfigResponseBody getBody() {
        return this.body;
    }

}
