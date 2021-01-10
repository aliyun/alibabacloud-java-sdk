// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectMissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasInspectMissionResponseBody body;

    public static UpdateHasInspectMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectMissionResponse self = new UpdateHasInspectMissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasInspectMissionResponse setBody(UpdateHasInspectMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasInspectMissionResponseBody getBody() {
        return this.body;
    }

}
