// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainPunishStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDomainPunishStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainPunishStatusResponseBody self = new ModifyDomainPunishStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDomainPunishStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
