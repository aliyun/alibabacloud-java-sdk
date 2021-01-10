// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncHasCloudarchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncHasCloudarchResponseBody body;

    public static SyncHasCloudarchResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncHasCloudarchResponse self = new SyncHasCloudarchResponse();
        return TeaModel.build(map, self);
    }

    public SyncHasCloudarchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncHasCloudarchResponse setBody(SyncHasCloudarchResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncHasCloudarchResponseBody getBody() {
        return this.body;
    }

}
