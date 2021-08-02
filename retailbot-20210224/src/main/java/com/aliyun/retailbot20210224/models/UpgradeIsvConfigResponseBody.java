// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradeIsvConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeIsvConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeIsvConfigResponseBody self = new UpgradeIsvConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeIsvConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
