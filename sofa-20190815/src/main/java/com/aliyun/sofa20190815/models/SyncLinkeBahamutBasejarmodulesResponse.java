// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutBasejarmodulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncLinkeBahamutBasejarmodulesResponseBody body;

    public static SyncLinkeBahamutBasejarmodulesResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutBasejarmodulesResponse self = new SyncLinkeBahamutBasejarmodulesResponse();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutBasejarmodulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncLinkeBahamutBasejarmodulesResponse setBody(SyncLinkeBahamutBasejarmodulesResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncLinkeBahamutBasejarmodulesResponseBody getBody() {
        return this.body;
    }

}
