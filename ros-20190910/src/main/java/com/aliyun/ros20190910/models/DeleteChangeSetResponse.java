// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteChangeSetResponseBody body;

    public static DeleteChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChangeSetResponse self = new DeleteChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChangeSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChangeSetResponse setBody(DeleteChangeSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChangeSetResponseBody getBody() {
        return this.body;
    }

}
