// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTagValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteTagValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTagValueResponse setBody(DeleteTagValueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagValueResponseBody getBody() {
        return this.body;
    }

}
