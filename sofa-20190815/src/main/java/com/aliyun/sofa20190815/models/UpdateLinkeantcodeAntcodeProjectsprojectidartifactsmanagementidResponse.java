// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponseBody body;

    public static UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse self = new UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse setBody(UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponseBody getBody() {
        return this.body;
    }

}
