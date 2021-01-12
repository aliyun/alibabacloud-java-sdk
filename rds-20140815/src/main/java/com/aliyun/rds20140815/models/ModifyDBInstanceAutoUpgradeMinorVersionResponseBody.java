// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAutoUpgradeMinorVersionResponseBody extends TeaModel {
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
