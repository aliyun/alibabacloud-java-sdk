// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectMissionscheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasInspectMissionscheduleResponseBody body;

    public static UpdateHasInspectMissionscheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectMissionscheduleResponse self = new UpdateHasInspectMissionscheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectMissionscheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasInspectMissionscheduleResponse setBody(UpdateHasInspectMissionscheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasInspectMissionscheduleResponseBody getBody() {
        return this.body;
    }

}
