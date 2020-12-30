// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetEndPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEndPointResponseBody body;

    public static GetEndPointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEndPointResponse self = new GetEndPointResponse();
        return TeaModel.build(map, self);
    }

    public GetEndPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEndPointResponse setBody(GetEndPointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEndPointResponseBody getBody() {
        return this.body;
    }

}
