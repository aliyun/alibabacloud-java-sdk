// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeInstallationsserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeInstallationsserviceResponseBody body;

    public static AddLinkeantcodeAntcodeInstallationsserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeInstallationsserviceResponse self = new AddLinkeantcodeAntcodeInstallationsserviceResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeInstallationsserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeInstallationsserviceResponse setBody(AddLinkeantcodeAntcodeInstallationsserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeInstallationsserviceResponseBody getBody() {
        return this.body;
    }

}
