// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutAppsynctocloudResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncLinkeBahamutAppsynctocloudResponseBody body;

    public static SyncLinkeBahamutAppsynctocloudResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutAppsynctocloudResponse self = new SyncLinkeBahamutAppsynctocloudResponse();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutAppsynctocloudResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncLinkeBahamutAppsynctocloudResponse setBody(SyncLinkeBahamutAppsynctocloudResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncLinkeBahamutAppsynctocloudResponseBody getBody() {
        return this.body;
    }

}
