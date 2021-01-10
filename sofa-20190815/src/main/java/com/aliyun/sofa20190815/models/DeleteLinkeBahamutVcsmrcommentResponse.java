// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutVcsmrcommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutVcsmrcommentResponseBody body;

    public static DeleteLinkeBahamutVcsmrcommentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutVcsmrcommentResponse self = new DeleteLinkeBahamutVcsmrcommentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutVcsmrcommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutVcsmrcommentResponse setBody(DeleteLinkeBahamutVcsmrcommentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutVcsmrcommentResponseBody getBody() {
        return this.body;
    }

}
