// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTagValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTagValueResponseBody body;

    public static DeleteTagValueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagValueResponse self = new DeleteTagValueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagValueResponse setBody(DeleteTagValueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagValueResponseBody getBody() {
        return this.body;
    }

}
