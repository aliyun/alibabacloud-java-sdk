// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainCertResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>03E3B4DD-2BE7-5D9D-80E8-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDomainCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainCertResponseBody self = new ModifyDomainCertResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDomainCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
