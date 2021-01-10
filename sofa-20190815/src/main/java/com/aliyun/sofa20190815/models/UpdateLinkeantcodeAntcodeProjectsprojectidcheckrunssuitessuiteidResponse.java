// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody body;

    public static UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse self = new UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse setBody(UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody getBody() {
        return this.body;
    }

}
