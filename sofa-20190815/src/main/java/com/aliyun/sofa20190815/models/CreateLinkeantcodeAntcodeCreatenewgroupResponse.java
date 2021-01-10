// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreatenewgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody body;

    public static CreateLinkeantcodeAntcodeCreatenewgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreatenewgroupResponse self = new CreateLinkeantcodeAntcodeCreatenewgroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponse setBody(CreateLinkeantcodeAntcodeCreatenewgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody getBody() {
        return this.body;
    }

}
