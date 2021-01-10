// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectMissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectMissionResponseBody body;

    public static ExecHasInspectMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectMissionResponse self = new ExecHasInspectMissionResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectMissionResponse setBody(ExecHasInspectMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectMissionResponseBody getBody() {
        return this.body;
    }

}
