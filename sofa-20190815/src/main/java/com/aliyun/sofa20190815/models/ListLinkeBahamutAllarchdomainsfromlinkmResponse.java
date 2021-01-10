// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAllarchdomainsfromlinkmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody body;

    public static ListLinkeBahamutAllarchdomainsfromlinkmResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAllarchdomainsfromlinkmResponse self = new ListLinkeBahamutAllarchdomainsfromlinkmResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponse setBody(ListLinkeBahamutAllarchdomainsfromlinkmResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody getBody() {
        return this.body;
    }

}
