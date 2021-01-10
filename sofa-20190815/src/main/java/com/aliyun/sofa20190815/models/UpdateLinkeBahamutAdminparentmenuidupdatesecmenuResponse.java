// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody body;

    public static UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse self = new UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse setBody(UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody getBody() {
        return this.body;
    }

}
