// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainPunishStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>70E65A35-22B8-567C-B0A0-A2E9****20AE</p>
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
