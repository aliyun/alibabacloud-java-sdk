// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectMissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectMissionResponseBody body;

    public static GetHasInspectMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectMissionResponse self = new GetHasInspectMissionResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectMissionResponse setBody(GetHasInspectMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectMissionResponseBody getBody() {
        return this.body;
    }

}
