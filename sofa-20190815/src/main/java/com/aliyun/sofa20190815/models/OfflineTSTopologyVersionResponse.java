// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OfflineTSTopologyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OfflineTSTopologyVersionResponseBody body;

    public static OfflineTSTopologyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineTSTopologyVersionResponse self = new OfflineTSTopologyVersionResponse();
        return TeaModel.build(map, self);
    }

    public OfflineTSTopologyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineTSTopologyVersionResponse setBody(OfflineTSTopologyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineTSTopologyVersionResponseBody getBody() {
        return this.body;
    }

}
