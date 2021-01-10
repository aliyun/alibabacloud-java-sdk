// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResumeTSTriggerInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeTSTriggerInstanceResponseBody body;

    public static ResumeTSTriggerInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeTSTriggerInstanceResponse self = new ResumeTSTriggerInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResumeTSTriggerInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeTSTriggerInstanceResponse setBody(ResumeTSTriggerInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeTSTriggerInstanceResponseBody getBody() {
        return this.body;
    }

}
