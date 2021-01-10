// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody body;

    public static MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse build(java.util.Map<String, ?> map) throws Exception {
        MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse self = new MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse();
        return TeaModel.build(map, self);
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse setBody(MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody body) {
        this.body = body;
        return this;
    }
    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody getBody() {
        return this.body;
    }

}
