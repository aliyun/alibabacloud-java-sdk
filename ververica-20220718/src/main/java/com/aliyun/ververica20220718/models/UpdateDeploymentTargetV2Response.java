// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentTargetV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeploymentTargetV2ResponseBody body;

    public static UpdateDeploymentTargetV2Response build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentTargetV2Response self = new UpdateDeploymentTargetV2Response();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentTargetV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentTargetV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeploymentTargetV2Response setBody(UpdateDeploymentTargetV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentTargetV2ResponseBody getBody() {
        return this.body;
    }

}
