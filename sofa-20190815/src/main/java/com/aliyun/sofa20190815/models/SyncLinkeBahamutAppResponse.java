// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncLinkeBahamutAppResponseBody body;

    public static SyncLinkeBahamutAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutAppResponse self = new SyncLinkeBahamutAppResponse();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncLinkeBahamutAppResponse setBody(SyncLinkeBahamutAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncLinkeBahamutAppResponseBody getBody() {
        return this.body;
    }

}
