// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutPaasdeleteserversResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutPaasdeleteserversResponseBody body;

    public static DeleteLinkeBahamutPaasdeleteserversResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutPaasdeleteserversResponse self = new DeleteLinkeBahamutPaasdeleteserversResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutPaasdeleteserversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutPaasdeleteserversResponse setBody(DeleteLinkeBahamutPaasdeleteserversResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutPaasdeleteserversResponseBody getBody() {
        return this.body;
    }

}
