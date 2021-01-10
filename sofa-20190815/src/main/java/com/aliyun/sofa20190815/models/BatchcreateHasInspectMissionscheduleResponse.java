// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateHasInspectMissionscheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchcreateHasInspectMissionscheduleResponseBody body;

    public static BatchcreateHasInspectMissionscheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateHasInspectMissionscheduleResponse self = new BatchcreateHasInspectMissionscheduleResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateHasInspectMissionscheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchcreateHasInspectMissionscheduleResponse setBody(BatchcreateHasInspectMissionscheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchcreateHasInspectMissionscheduleResponseBody getBody() {
        return this.body;
    }

}
