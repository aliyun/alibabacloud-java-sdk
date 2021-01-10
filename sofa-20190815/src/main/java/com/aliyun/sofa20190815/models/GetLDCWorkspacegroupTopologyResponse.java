// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCWorkspacegroupTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLDCWorkspacegroupTopologyResponseBody body;

    public static GetLDCWorkspacegroupTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLDCWorkspacegroupTopologyResponse self = new GetLDCWorkspacegroupTopologyResponse();
        return TeaModel.build(map, self);
    }

    public GetLDCWorkspacegroupTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLDCWorkspacegroupTopologyResponse setBody(GetLDCWorkspacegroupTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLDCWorkspacegroupTopologyResponseBody getBody() {
        return this.body;
    }

}
