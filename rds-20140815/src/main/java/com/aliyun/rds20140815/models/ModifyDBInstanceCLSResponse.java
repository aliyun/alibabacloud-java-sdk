// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceCLSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceCLSResponseBody body;

    public static ModifyDBInstanceCLSResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceCLSResponse self = new ModifyDBInstanceCLSResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceCLSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceCLSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceCLSResponse setBody(ModifyDBInstanceCLSResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceCLSResponseBody getBody() {
        return this.body;
    }

}
