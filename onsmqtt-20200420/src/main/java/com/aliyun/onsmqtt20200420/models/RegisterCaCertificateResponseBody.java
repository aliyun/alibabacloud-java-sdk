// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterCaCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sn")
    public String sn;

    public static RegisterCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterCaCertificateResponseBody self = new RegisterCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterCaCertificateResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
