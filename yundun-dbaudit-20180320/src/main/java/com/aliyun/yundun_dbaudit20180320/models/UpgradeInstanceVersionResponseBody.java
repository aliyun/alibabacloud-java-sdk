// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class UpgradeInstanceVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeInstanceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceVersionResponseBody self = new UpgradeInstanceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
