// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectMissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasInspectMissionResponseBody body;

    public static CreateHasInspectMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectMissionResponse self = new CreateHasInspectMissionResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasInspectMissionResponse setBody(CreateHasInspectMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasInspectMissionResponseBody getBody() {
        return this.body;
    }

}
