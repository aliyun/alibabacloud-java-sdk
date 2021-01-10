// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAppbranchsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutAppbranchsResponseBody body;

    public static ListLinkeBahamutAppbranchsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAppbranchsResponse self = new ListLinkeBahamutAppbranchsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAppbranchsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutAppbranchsResponse setBody(ListLinkeBahamutAppbranchsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutAppbranchsResponseBody getBody() {
        return this.body;
    }

}
