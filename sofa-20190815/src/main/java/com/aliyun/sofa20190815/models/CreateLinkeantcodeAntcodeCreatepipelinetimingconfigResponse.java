// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponseBody body;

    public static CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse self = new CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse setBody(CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponseBody getBody() {
        return this.body;
    }

}
