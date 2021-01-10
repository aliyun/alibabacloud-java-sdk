// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMonitorEncodednameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSMonitorEncodednameResponseBody body;

    public static GetDWSMonitorEncodednameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMonitorEncodednameResponse self = new GetDWSMonitorEncodednameResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSMonitorEncodednameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSMonitorEncodednameResponse setBody(GetDWSMonitorEncodednameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSMonitorEncodednameResponseBody getBody() {
        return this.body;
    }

}
