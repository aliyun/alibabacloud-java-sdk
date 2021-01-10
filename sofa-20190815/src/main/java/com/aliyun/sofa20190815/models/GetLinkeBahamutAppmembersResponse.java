// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppmembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAppmembersResponseBody body;

    public static GetLinkeBahamutAppmembersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppmembersResponse self = new GetLinkeBahamutAppmembersResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppmembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAppmembersResponse setBody(GetLinkeBahamutAppmembersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAppmembersResponseBody getBody() {
        return this.body;
    }

}
