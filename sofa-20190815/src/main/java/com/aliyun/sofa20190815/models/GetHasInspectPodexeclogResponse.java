// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPodexeclogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectPodexeclogResponseBody body;

    public static GetHasInspectPodexeclogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPodexeclogResponse self = new GetHasInspectPodexeclogResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPodexeclogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectPodexeclogResponse setBody(GetHasInspectPodexeclogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectPodexeclogResponseBody getBody() {
        return this.body;
    }

}
