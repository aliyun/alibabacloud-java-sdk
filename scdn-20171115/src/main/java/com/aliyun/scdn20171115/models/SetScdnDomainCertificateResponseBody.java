// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnDomainCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetScdnDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetScdnDomainCertificateResponseBody self = new SetScdnDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetScdnDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
