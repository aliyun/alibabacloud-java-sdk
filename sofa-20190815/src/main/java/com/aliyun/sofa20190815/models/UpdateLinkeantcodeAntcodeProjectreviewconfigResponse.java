// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectreviewconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody body;

    public static UpdateLinkeantcodeAntcodeProjectreviewconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectreviewconfigResponse self = new UpdateLinkeantcodeAntcodeProjectreviewconfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponse setBody(UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody getBody() {
        return this.body;
    }

}
