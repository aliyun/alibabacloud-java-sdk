// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllLinkeBahamutAppmembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllLinkeBahamutAppmembersResponseBody body;

    public static AllLinkeBahamutAppmembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AllLinkeBahamutAppmembersResponse self = new AllLinkeBahamutAppmembersResponse();
        return TeaModel.build(map, self);
    }

    public AllLinkeBahamutAppmembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllLinkeBahamutAppmembersResponse setBody(AllLinkeBahamutAppmembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AllLinkeBahamutAppmembersResponseBody getBody() {
        return this.body;
    }

}
