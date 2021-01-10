// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class MountLinkedeploycoreDeploycoreAppserviceapplyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody body;

    public static MountLinkedeploycoreDeploycoreAppserviceapplyResponse build(java.util.Map<String, ?> map) throws Exception {
        MountLinkedeploycoreDeploycoreAppserviceapplyResponse self = new MountLinkedeploycoreDeploycoreAppserviceapplyResponse();
        return TeaModel.build(map, self);
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyResponse setBody(MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody body) {
        this.body = body;
        return this;
    }
    public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody getBody() {
        return this.body;
    }

}
