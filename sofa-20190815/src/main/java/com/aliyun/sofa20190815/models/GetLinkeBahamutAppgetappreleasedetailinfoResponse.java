// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppgetappreleasedetailinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody body;

    public static GetLinkeBahamutAppgetappreleasedetailinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppgetappreleasedetailinfoResponse self = new GetLinkeBahamutAppgetappreleasedetailinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponse setBody(GetLinkeBahamutAppgetappreleasedetailinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody getBody() {
        return this.body;
    }

}
