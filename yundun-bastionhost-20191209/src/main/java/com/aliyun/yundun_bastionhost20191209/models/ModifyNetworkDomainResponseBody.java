// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyNetworkDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ED49CD1E-3510-5E5C-9133-E2067B656501</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNetworkDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkDomainResponseBody self = new ModifyNetworkDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
