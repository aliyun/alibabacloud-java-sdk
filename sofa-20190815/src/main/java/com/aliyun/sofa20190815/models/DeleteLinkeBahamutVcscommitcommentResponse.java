// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutVcscommitcommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutVcscommitcommentResponseBody body;

    public static DeleteLinkeBahamutVcscommitcommentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutVcscommitcommentResponse self = new DeleteLinkeBahamutVcscommitcommentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutVcscommitcommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutVcscommitcommentResponse setBody(DeleteLinkeBahamutVcscommitcommentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutVcscommitcommentResponseBody getBody() {
        return this.body;
    }

}
