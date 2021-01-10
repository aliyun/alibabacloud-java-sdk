// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody body;

    public static SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse self = new SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse();
        return TeaModel.build(map, self);
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse setBody(SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody getBody() {
        return this.body;
    }

}
