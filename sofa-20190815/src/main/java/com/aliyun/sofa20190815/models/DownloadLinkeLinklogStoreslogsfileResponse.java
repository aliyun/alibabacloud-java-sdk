// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DownloadLinkeLinklogStoreslogsfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadLinkeLinklogStoreslogsfileResponseBody body;

    public static DownloadLinkeLinklogStoreslogsfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadLinkeLinklogStoreslogsfileResponse self = new DownloadLinkeLinklogStoreslogsfileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadLinkeLinklogStoreslogsfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadLinkeLinklogStoreslogsfileResponse setBody(DownloadLinkeLinklogStoreslogsfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadLinkeLinklogStoreslogsfileResponseBody getBody() {
        return this.body;
    }

}
