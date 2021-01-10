// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutWorkspacesResponseBody body;

    public static ListLinkeBahamutWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutWorkspacesResponse self = new ListLinkeBahamutWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutWorkspacesResponse setBody(ListLinkeBahamutWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutWorkspacesResponseBody getBody() {
        return this.body;
    }

}
