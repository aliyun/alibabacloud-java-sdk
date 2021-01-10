// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminproductidupdatemenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody body;

    public static UpdateLinkeBahamutAdminproductidupdatemenuResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminproductidupdatemenuResponse self = new UpdateLinkeBahamutAdminproductidupdatemenuResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponse setBody(UpdateLinkeBahamutAdminproductidupdatemenuResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody getBody() {
        return this.body;
    }

}
