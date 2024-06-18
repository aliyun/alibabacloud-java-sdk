// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceProxyConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9705B5D2-C5B6-4526-B779-26D755EC1B8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceProxyConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceProxyConfigurationResponseBody self = new ModifyDBInstanceProxyConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceProxyConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
