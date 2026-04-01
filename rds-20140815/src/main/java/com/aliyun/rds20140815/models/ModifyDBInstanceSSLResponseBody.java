// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>777C4593-8053-427B-99E2-105593277CAB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSSLResponseBody self = new ModifyDBInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
