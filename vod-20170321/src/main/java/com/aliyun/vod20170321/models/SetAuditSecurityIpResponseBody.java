// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAuditSecurityIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetAuditSecurityIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAuditSecurityIpResponseBody self = new SetAuditSecurityIpResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAuditSecurityIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
