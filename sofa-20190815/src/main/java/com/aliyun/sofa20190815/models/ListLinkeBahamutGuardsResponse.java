// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutGuardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutGuardsResponseBody body;

    public static ListLinkeBahamutGuardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutGuardsResponse self = new ListLinkeBahamutGuardsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutGuardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutGuardsResponse setBody(ListLinkeBahamutGuardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutGuardsResponseBody getBody() {
        return this.body;
    }

}
