// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsDomainCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetVsDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVsDomainCertificateResponseBody self = new SetVsDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVsDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
