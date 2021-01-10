// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectMissionscheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasInspectMissionscheduleResponseBody body;

    public static DeleteHasInspectMissionscheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectMissionscheduleResponse self = new DeleteHasInspectMissionscheduleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectMissionscheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasInspectMissionscheduleResponse setBody(DeleteHasInspectMissionscheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasInspectMissionscheduleResponseBody getBody() {
        return this.body;
    }

}
