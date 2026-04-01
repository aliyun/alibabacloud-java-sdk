// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAutoUpgradeMinorVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A31818D5-0550-4A81-8D13-B45948D7193F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceAutoUpgradeMinorVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAutoUpgradeMinorVersionResponseBody self = new ModifyDBInstanceAutoUpgradeMinorVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAutoUpgradeMinorVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
