// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetVodDomainCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-****-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetVodDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVodDomainCertificateResponseBody self = new SetVodDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVodDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
