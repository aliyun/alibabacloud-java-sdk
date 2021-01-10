// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminupdatecommonuseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody body;

    public static UpdateLinkeBahamutAdminupdatecommonuseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminupdatecommonuseResponse self = new UpdateLinkeBahamutAdminupdatecommonuseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponse setBody(UpdateLinkeBahamutAdminupdatecommonuseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody getBody() {
        return this.body;
    }

}
