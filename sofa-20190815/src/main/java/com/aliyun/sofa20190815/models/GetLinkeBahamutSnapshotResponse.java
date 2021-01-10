// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutSnapshotResponseBody body;

    public static GetLinkeBahamutSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutSnapshotResponse self = new GetLinkeBahamutSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutSnapshotResponse setBody(GetLinkeBahamutSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutSnapshotResponseBody getBody() {
        return this.body;
    }

}
