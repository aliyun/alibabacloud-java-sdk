// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutApplevelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutApplevelsResponseBody body;

    public static ListLinkeBahamutApplevelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutApplevelsResponse self = new ListLinkeBahamutApplevelsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutApplevelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutApplevelsResponse setBody(ListLinkeBahamutApplevelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutApplevelsResponseBody getBody() {
        return this.body;
    }

}
