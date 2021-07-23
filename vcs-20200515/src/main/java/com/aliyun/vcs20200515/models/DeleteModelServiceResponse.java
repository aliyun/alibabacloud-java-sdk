// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteModelServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteModelServiceResponseBody body;

    public static DeleteModelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelServiceResponse self = new DeleteModelServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelServiceResponse setBody(DeleteModelServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelServiceResponseBody getBody() {
        return this.body;
    }

}
