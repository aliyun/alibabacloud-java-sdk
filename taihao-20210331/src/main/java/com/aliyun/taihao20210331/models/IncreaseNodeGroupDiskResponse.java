// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroupDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IncreaseNodeGroupDiskResponseBody body;

    public static IncreaseNodeGroupDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroupDiskResponse self = new IncreaseNodeGroupDiskResponse();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroupDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IncreaseNodeGroupDiskResponse setBody(IncreaseNodeGroupDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public IncreaseNodeGroupDiskResponseBody getBody() {
        return this.body;
    }

}
