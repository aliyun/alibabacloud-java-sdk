// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpgradeInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceResponseBody self = new UpgradeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
