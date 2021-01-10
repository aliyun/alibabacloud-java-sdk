// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutBuildconfigregistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutBuildconfigregistryResponseBody body;

    public static ListLinkeBahamutBuildconfigregistryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutBuildconfigregistryResponse self = new ListLinkeBahamutBuildconfigregistryResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutBuildconfigregistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutBuildconfigregistryResponse setBody(ListLinkeBahamutBuildconfigregistryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutBuildconfigregistryResponseBody getBody() {
        return this.body;
    }

}
