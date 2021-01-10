// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUserlimitsettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody body;

    public static UpdateLinkeantcodeAntcodeUserlimitsettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUserlimitsettingsResponse self = new UpdateLinkeantcodeAntcodeUserlimitsettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponse setBody(UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody getBody() {
        return this.body;
    }

}
