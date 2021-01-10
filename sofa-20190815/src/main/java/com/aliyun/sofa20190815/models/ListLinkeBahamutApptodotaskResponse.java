// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutApptodotaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutApptodotaskResponseBody body;

    public static ListLinkeBahamutApptodotaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutApptodotaskResponse self = new ListLinkeBahamutApptodotaskResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutApptodotaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutApptodotaskResponse setBody(ListLinkeBahamutApptodotaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutApptodotaskResponseBody getBody() {
        return this.body;
    }

}
