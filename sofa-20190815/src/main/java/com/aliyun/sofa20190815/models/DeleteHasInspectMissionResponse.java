// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectMissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasInspectMissionResponseBody body;

    public static DeleteHasInspectMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectMissionResponse self = new DeleteHasInspectMissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasInspectMissionResponse setBody(DeleteHasInspectMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasInspectMissionResponseBody getBody() {
        return this.body;
    }

}
