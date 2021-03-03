// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyDomainIpv6StatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDomainIpv6StatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainIpv6StatusResponseBody self = new ModifyDomainIpv6StatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDomainIpv6StatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
