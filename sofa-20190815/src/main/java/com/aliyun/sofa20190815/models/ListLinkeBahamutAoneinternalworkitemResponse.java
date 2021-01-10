// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAoneinternalworkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutAoneinternalworkitemResponseBody body;

    public static ListLinkeBahamutAoneinternalworkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAoneinternalworkitemResponse self = new ListLinkeBahamutAoneinternalworkitemResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAoneinternalworkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutAoneinternalworkitemResponse setBody(ListLinkeBahamutAoneinternalworkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutAoneinternalworkitemResponseBody getBody() {
        return this.body;
    }

}
