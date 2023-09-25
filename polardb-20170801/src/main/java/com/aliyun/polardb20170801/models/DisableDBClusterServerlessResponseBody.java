// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterServerlessResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RequestId")
    public String requestId;

    public static DisableDBClusterServerlessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterServerlessResponseBody self = new DisableDBClusterServerlessResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterServerlessResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DisableDBClusterServerlessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
