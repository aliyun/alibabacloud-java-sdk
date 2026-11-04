// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAutoUpgradeMinorVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterAutoUpgradeMinorVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAutoUpgradeMinorVersionResponseBody self = new ModifyDBClusterAutoUpgradeMinorVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAutoUpgradeMinorVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
