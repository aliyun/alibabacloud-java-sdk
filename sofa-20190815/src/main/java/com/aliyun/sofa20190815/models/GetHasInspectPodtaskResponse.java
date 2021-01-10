// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPodtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectPodtaskResponseBody body;

    public static GetHasInspectPodtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPodtaskResponse self = new GetHasInspectPodtaskResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPodtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectPodtaskResponse setBody(GetHasInspectPodtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectPodtaskResponseBody getBody() {
        return this.body;
    }

}
