// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutAppsyncforadminResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncLinkeBahamutAppsyncforadminResponseBody body;

    public static SyncLinkeBahamutAppsyncforadminResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutAppsyncforadminResponse self = new SyncLinkeBahamutAppsyncforadminResponse();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutAppsyncforadminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncLinkeBahamutAppsyncforadminResponse setBody(SyncLinkeBahamutAppsyncforadminResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncLinkeBahamutAppsyncforadminResponseBody getBody() {
        return this.body;
    }

}
