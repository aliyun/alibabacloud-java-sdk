// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminupdateproductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdminupdateproductResponseBody body;

    public static UpdateLinkeBahamutAdminupdateproductResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminupdateproductResponse self = new UpdateLinkeBahamutAdminupdateproductResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminupdateproductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdminupdateproductResponse setBody(UpdateLinkeBahamutAdminupdateproductResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdminupdateproductResponseBody getBody() {
        return this.body;
    }

}
