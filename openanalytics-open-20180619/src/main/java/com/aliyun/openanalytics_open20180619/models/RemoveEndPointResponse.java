// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class RemoveEndPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveEndPointResponseBody body;

    public static RemoveEndPointResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEndPointResponse self = new RemoveEndPointResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEndPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEndPointResponse setBody(RemoveEndPointResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEndPointResponseBody getBody() {
        return this.body;
    }

}
