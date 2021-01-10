// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectFixmissionscheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectFixmissionscheduleResponseBody body;

    public static ExecHasInspectFixmissionscheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectFixmissionscheduleResponse self = new ExecHasInspectFixmissionscheduleResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectFixmissionscheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectFixmissionscheduleResponse setBody(ExecHasInspectFixmissionscheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectFixmissionscheduleResponseBody getBody() {
        return this.body;
    }

}
