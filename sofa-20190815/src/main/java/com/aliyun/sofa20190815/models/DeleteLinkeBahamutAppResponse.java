// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutAppResponseBody body;

    public static DeleteLinkeBahamutAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAppResponse self = new DeleteLinkeBahamutAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutAppResponse setBody(DeleteLinkeBahamutAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutAppResponseBody getBody() {
        return this.body;
    }

}
