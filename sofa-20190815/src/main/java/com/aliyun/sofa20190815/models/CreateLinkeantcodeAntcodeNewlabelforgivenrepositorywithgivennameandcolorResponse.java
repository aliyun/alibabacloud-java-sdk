// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorResponseBody body;

    public static CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorResponse self = new CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorResponse setBody(CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorResponseBody getBody() {
        return this.body;
    }

}
