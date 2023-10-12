// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class StartBEClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartBEClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartBEClusterResponseBody self = new StartBEClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public StartBEClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
