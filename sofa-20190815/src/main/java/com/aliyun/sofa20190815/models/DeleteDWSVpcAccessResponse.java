// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSVpcAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDWSVpcAccessResponseBody body;

    public static DeleteDWSVpcAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSVpcAccessResponse self = new DeleteDWSVpcAccessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDWSVpcAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDWSVpcAccessResponse setBody(DeleteDWSVpcAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDWSVpcAccessResponseBody getBody() {
        return this.body;
    }

}
