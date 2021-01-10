// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetmembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapigetmembersResponseBody body;

    public static GetLinkeBahamutWebapigetmembersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetmembersResponse self = new GetLinkeBahamutWebapigetmembersResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetmembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapigetmembersResponse setBody(GetLinkeBahamutWebapigetmembersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapigetmembersResponseBody getBody() {
        return this.body;
    }

}
