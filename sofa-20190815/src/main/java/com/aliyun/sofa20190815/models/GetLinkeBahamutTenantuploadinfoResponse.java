// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTenantuploadinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutTenantuploadinfoResponseBody body;

    public static GetLinkeBahamutTenantuploadinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTenantuploadinfoResponse self = new GetLinkeBahamutTenantuploadinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTenantuploadinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutTenantuploadinfoResponse setBody(GetLinkeBahamutTenantuploadinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutTenantuploadinfoResponseBody getBody() {
        return this.body;
    }

}
