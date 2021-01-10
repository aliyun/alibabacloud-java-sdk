// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportLinkedeploycoreDeploycoreAppserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportLinkedeploycoreDeploycoreAppserviceResponseBody body;

    public static ImportLinkedeploycoreDeploycoreAppserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportLinkedeploycoreDeploycoreAppserviceResponse self = new ImportLinkedeploycoreDeploycoreAppserviceResponse();
        return TeaModel.build(map, self);
    }

    public ImportLinkedeploycoreDeploycoreAppserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportLinkedeploycoreDeploycoreAppserviceResponse setBody(ImportLinkedeploycoreDeploycoreAppserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportLinkedeploycoreDeploycoreAppserviceResponseBody getBody() {
        return this.body;
    }

}
