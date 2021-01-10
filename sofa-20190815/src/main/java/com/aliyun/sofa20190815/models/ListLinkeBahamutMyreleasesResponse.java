// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutMyreleasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutMyreleasesResponseBody body;

    public static ListLinkeBahamutMyreleasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutMyreleasesResponse self = new ListLinkeBahamutMyreleasesResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutMyreleasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutMyreleasesResponse setBody(ListLinkeBahamutMyreleasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutMyreleasesResponseBody getBody() {
        return this.body;
    }

}
