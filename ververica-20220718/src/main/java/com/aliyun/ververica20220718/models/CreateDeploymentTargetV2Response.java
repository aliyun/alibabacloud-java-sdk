// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateDeploymentTargetV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeploymentTargetV2ResponseBody body;

    public static CreateDeploymentTargetV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTargetV2Response self = new CreateDeploymentTargetV2Response();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTargetV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeploymentTargetV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeploymentTargetV2Response setBody(CreateDeploymentTargetV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeploymentTargetV2ResponseBody getBody() {
        return this.body;
    }

}
