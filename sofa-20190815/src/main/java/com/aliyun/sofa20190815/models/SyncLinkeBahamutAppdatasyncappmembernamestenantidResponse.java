// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutAppdatasyncappmembernamestenantidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncLinkeBahamutAppdatasyncappmembernamestenantidResponseBody body;

    public static SyncLinkeBahamutAppdatasyncappmembernamestenantidResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutAppdatasyncappmembernamestenantidResponse self = new SyncLinkeBahamutAppdatasyncappmembernamestenantidResponse();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutAppdatasyncappmembernamestenantidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncLinkeBahamutAppdatasyncappmembernamestenantidResponse setBody(SyncLinkeBahamutAppdatasyncappmembernamestenantidResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncLinkeBahamutAppdatasyncappmembernamestenantidResponseBody getBody() {
        return this.body;
    }

}
