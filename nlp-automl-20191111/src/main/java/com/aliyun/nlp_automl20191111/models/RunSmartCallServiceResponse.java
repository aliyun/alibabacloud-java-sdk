// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunSmartCallServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunSmartCallServiceResponseBody body;

    public static RunSmartCallServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSmartCallServiceResponse self = new RunSmartCallServiceResponse();
        return TeaModel.build(map, self);
    }

    public RunSmartCallServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSmartCallServiceResponse setBody(RunSmartCallServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSmartCallServiceResponseBody getBody() {
        return this.body;
    }

}
