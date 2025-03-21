// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetVodDomainSSLCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F4C6D5BE-BF13-45*****6C-516EA8906DCD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetVodDomainSSLCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVodDomainSSLCertificateResponseBody self = new SetVodDomainSSLCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVodDomainSSLCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
