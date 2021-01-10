// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdminiterationtemplateeditstageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody body;

    public static SaveLinkeBahamutAdminiterationtemplateeditstageResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdminiterationtemplateeditstageResponse self = new SaveLinkeBahamutAdminiterationtemplateeditstageResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponse setBody(SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody getBody() {
        return this.body;
    }

}
