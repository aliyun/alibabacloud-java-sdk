// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitDynamicImageJobResponseBody body;

    public static SubmitDynamicImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobResponse self = new SubmitDynamicImageJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicImageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDynamicImageJobResponse setBody(SubmitDynamicImageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDynamicImageJobResponseBody getBody() {
        return this.body;
    }

}
