// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAdminworkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutAdminworkspaceResponseBody body;

    public static ListLinkeBahamutAdminworkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAdminworkspaceResponse self = new ListLinkeBahamutAdminworkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAdminworkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutAdminworkspaceResponse setBody(ListLinkeBahamutAdminworkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutAdminworkspaceResponseBody getBody() {
        return this.body;
    }

}
