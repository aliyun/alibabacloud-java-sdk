// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitMediaDNADeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitMediaDNADeleteJobResponseBody body;

    public static SubmitMediaDNADeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaDNADeleteJobResponse self = new SubmitMediaDNADeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaDNADeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaDNADeleteJobResponse setBody(SubmitMediaDNADeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaDNADeleteJobResponseBody getBody() {
        return this.body;
    }

}
