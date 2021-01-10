// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DownloadLinkeLinklogStoreslogsfilefromossResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadLinkeLinklogStoreslogsfilefromossResponseBody body;

    public static DownloadLinkeLinklogStoreslogsfilefromossResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadLinkeLinklogStoreslogsfilefromossResponse self = new DownloadLinkeLinklogStoreslogsfilefromossResponse();
        return TeaModel.build(map, self);
    }

    public DownloadLinkeLinklogStoreslogsfilefromossResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadLinkeLinklogStoreslogsfilefromossResponse setBody(DownloadLinkeLinklogStoreslogsfilefromossResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadLinkeLinklogStoreslogsfilefromossResponseBody getBody() {
        return this.body;
    }

}
