// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetMsSgServiceParamWeightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetMsSgServiceParamWeightResponseBody body;

    public static SetMsSgServiceParamWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMsSgServiceParamWeightResponse self = new SetMsSgServiceParamWeightResponse();
        return TeaModel.build(map, self);
    }

    public SetMsSgServiceParamWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMsSgServiceParamWeightResponse setBody(SetMsSgServiceParamWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMsSgServiceParamWeightResponseBody getBody() {
        return this.body;
    }

}
