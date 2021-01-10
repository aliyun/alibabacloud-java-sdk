// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTenantdownloadurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutTenantdownloadurlResponseBody body;

    public static GetLinkeBahamutTenantdownloadurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTenantdownloadurlResponse self = new GetLinkeBahamutTenantdownloadurlResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTenantdownloadurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutTenantdownloadurlResponse setBody(GetLinkeBahamutTenantdownloadurlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutTenantdownloadurlResponseBody getBody() {
        return this.body;
    }

}
