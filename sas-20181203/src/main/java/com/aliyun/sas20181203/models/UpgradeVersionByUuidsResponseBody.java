// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpgradeVersionByUuidsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeVersionByUuidsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeVersionByUuidsResponseBody self = new UpgradeVersionByUuidsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeVersionByUuidsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
