// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ReplaceUserClusterHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceUserClusterHostResponseBody body;

    public static ReplaceUserClusterHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceUserClusterHostResponse self = new ReplaceUserClusterHostResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceUserClusterHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceUserClusterHostResponse setBody(ReplaceUserClusterHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceUserClusterHostResponseBody getBody() {
        return this.body;
    }

}
