// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegistDRMCertInfoResponseBody extends TeaModel {
    @NameInMap("CertId")
    public String certId;

    @NameInMap("RequestId")
    public String requestId;

    public static RegistDRMCertInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegistDRMCertInfoResponseBody self = new RegistDRMCertInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public RegistDRMCertInfoResponseBody setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public RegistDRMCertInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
