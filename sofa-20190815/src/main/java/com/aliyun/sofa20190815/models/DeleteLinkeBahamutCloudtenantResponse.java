// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutCloudtenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutCloudtenantResponseBody body;

    public static DeleteLinkeBahamutCloudtenantResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutCloudtenantResponse self = new DeleteLinkeBahamutCloudtenantResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutCloudtenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutCloudtenantResponse setBody(DeleteLinkeBahamutCloudtenantResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutCloudtenantResponseBody getBody() {
        return this.body;
    }

}
