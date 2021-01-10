// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponseBody body;

    public static CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse self = new CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse setBody(CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponseBody getBody() {
        return this.body;
    }

}
