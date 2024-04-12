// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyNetworkDomainResponseBody extends TeaModel {
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
