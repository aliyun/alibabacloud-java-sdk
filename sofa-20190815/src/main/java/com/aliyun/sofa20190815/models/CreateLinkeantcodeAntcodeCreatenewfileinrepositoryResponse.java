// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponseBody body;

    public static CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse self = new CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse setBody(CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponseBody getBody() {
        return this.body;
    }

}
