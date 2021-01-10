// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OfflineTSJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OfflineTSJobResponseBody body;

    public static OfflineTSJobResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineTSJobResponse self = new OfflineTSJobResponse();
        return TeaModel.build(map, self);
    }

    public OfflineTSJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineTSJobResponse setBody(OfflineTSJobResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineTSJobResponseBody getBody() {
        return this.body;
    }

}
