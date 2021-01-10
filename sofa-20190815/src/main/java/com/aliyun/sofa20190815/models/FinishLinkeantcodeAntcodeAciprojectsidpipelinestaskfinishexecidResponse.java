// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponseBody body;

    public static FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse self = new FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse();
        return TeaModel.build(map, self);
    }

    public FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse setBody(FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponseBody getBody() {
        return this.body;
    }

}
