// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody body;

    public static CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse self = new CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse();
        return TeaModel.build(map, self);
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse setBody(CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody body) {
        this.body = body;
        return this;
    }
    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody getBody() {
        return this.body;
    }

}
