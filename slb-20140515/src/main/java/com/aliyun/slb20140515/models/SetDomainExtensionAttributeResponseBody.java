// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetDomainExtensionAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDomainExtensionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDomainExtensionAttributeResponseBody self = new SetDomainExtensionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDomainExtensionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
