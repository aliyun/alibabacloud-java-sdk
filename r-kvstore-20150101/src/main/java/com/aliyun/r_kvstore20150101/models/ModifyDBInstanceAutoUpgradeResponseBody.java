// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAutoUpgradeResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FF6158E-3394-4A90-B634-79C49184****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceAutoUpgradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAutoUpgradeResponseBody self = new ModifyDBInstanceAutoUpgradeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAutoUpgradeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
