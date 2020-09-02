// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6AddressAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyIpv6AddressAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6AddressAttributeResponse self = new ModifyIpv6AddressAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6AddressAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
