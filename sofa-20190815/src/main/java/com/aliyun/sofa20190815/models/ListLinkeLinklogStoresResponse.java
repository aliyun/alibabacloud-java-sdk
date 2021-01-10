// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinklogStoresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinklogStoresResponseBody body;

    public static ListLinkeLinklogStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinklogStoresResponse self = new ListLinkeLinklogStoresResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinklogStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinklogStoresResponse setBody(ListLinkeLinklogStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinklogStoresResponseBody getBody() {
        return this.body;
    }

}
