// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody body;

    public static CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse self = new CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse setBody(CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody getBody() {
        return this.body;
    }

}
