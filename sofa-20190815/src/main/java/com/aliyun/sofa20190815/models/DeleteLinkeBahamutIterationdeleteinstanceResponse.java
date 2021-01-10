// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutIterationdeleteinstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutIterationdeleteinstanceResponseBody body;

    public static DeleteLinkeBahamutIterationdeleteinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutIterationdeleteinstanceResponse self = new DeleteLinkeBahamutIterationdeleteinstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutIterationdeleteinstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutIterationdeleteinstanceResponse setBody(DeleteLinkeBahamutIterationdeleteinstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutIterationdeleteinstanceResponseBody getBody() {
        return this.body;
    }

}
