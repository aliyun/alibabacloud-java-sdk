// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppgetrepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAppgetrepoResponseBody body;

    public static GetLinkeBahamutAppgetrepoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppgetrepoResponse self = new GetLinkeBahamutAppgetrepoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppgetrepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAppgetrepoResponse setBody(GetLinkeBahamutAppgetrepoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAppgetrepoResponseBody getBody() {
        return this.body;
    }

}
