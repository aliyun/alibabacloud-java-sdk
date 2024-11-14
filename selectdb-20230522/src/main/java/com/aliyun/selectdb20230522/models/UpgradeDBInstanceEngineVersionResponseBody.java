// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceEngineVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeDBInstanceEngineVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceEngineVersionResponseBody self = new UpgradeDBInstanceEngineVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceEngineVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
