// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class CancelCreateCloudAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelCreateCloudAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelCreateCloudAccountResponseBody self = new CancelCreateCloudAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelCreateCloudAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
