// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodePrissuedetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodePrissuedetailResponseBody body;

    public static CreateLinkeantcodeAntcodePrissuedetailResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodePrissuedetailResponse self = new CreateLinkeantcodeAntcodePrissuedetailResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponse setBody(CreateLinkeantcodeAntcodePrissuedetailResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodePrissuedetailResponseBody getBody() {
        return this.body;
    }

}
