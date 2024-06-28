// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6AddressAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D560AF68-4CE8-4A5C-B3FE-469F558094D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpv6AddressAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6AddressAttributeResponseBody self = new ModifyIpv6AddressAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6AddressAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
