// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAppcustomciconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutAppcustomciconfigResponseBody body;

    public static DeleteLinkeBahamutAppcustomciconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAppcustomciconfigResponse self = new DeleteLinkeBahamutAppcustomciconfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAppcustomciconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutAppcustomciconfigResponse setBody(DeleteLinkeBahamutAppcustomciconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutAppcustomciconfigResponseBody getBody() {
        return this.body;
    }

}
