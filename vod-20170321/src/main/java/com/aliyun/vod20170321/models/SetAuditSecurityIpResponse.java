// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAuditSecurityIpResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetAuditSecurityIpResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAuditSecurityIpResponse self = new SetAuditSecurityIpResponse();
        return TeaModel.build(map, self);
    }

}
