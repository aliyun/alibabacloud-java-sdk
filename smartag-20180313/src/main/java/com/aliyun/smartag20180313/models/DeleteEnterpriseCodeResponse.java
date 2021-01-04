// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEnterpriseCodeResponseBody body;

    public static DeleteEnterpriseCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseCodeResponse self = new DeleteEnterpriseCodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnterpriseCodeResponse setBody(DeleteEnterpriseCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnterpriseCodeResponseBody getBody() {
        return this.body;
    }

}
