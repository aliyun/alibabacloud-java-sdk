// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmAppMeshInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVmAppMeshInfoResponseBody body;

    public static GetVmAppMeshInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVmAppMeshInfoResponse self = new GetVmAppMeshInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetVmAppMeshInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVmAppMeshInfoResponse setBody(GetVmAppMeshInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVmAppMeshInfoResponseBody getBody() {
        return this.body;
    }

}
