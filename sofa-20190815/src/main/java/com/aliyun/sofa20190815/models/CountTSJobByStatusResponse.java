// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountTSJobByStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountTSJobByStatusResponseBody body;

    public static CountTSJobByStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CountTSJobByStatusResponse self = new CountTSJobByStatusResponse();
        return TeaModel.build(map, self);
    }

    public CountTSJobByStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountTSJobByStatusResponse setBody(CountTSJobByStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CountTSJobByStatusResponseBody getBody() {
        return this.body;
    }

}
