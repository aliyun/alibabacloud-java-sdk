// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetServiceMeshSlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceMeshSlbResponseBody body;

    public static GetServiceMeshSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMeshSlbResponse self = new GetServiceMeshSlbResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceMeshSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceMeshSlbResponse setBody(GetServiceMeshSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceMeshSlbResponseBody getBody() {
        return this.body;
    }

}
