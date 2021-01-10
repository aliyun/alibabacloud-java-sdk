// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAdmintenantidconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAdmintenantidconfigResponseBody body;

    public static GetLinkeBahamutAdmintenantidconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAdmintenantidconfigResponse self = new GetLinkeBahamutAdmintenantidconfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAdmintenantidconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAdmintenantidconfigResponse setBody(GetLinkeBahamutAdmintenantidconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAdmintenantidconfigResponseBody getBody() {
        return this.body;
    }

}
