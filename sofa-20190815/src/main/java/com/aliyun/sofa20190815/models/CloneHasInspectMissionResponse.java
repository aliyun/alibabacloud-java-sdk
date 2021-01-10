// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneHasInspectMissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloneHasInspectMissionResponseBody body;

    public static CloneHasInspectMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneHasInspectMissionResponse self = new CloneHasInspectMissionResponse();
        return TeaModel.build(map, self);
    }

    public CloneHasInspectMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneHasInspectMissionResponse setBody(CloneHasInspectMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneHasInspectMissionResponseBody getBody() {
        return this.body;
    }

}
