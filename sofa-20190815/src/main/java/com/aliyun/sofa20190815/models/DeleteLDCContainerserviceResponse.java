// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCContainerserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDCContainerserviceResponseBody body;

    public static DeleteLDCContainerserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCContainerserviceResponse self = new DeleteLDCContainerserviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDCContainerserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDCContainerserviceResponse setBody(DeleteLDCContainerserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDCContainerserviceResponseBody getBody() {
        return this.body;
    }

}
