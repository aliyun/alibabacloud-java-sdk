// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ReplaceUserClusterHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NewHostId")
    public String newHostId;

    public static ReplaceUserClusterHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceUserClusterHostResponseBody self = new ReplaceUserClusterHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceUserClusterHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReplaceUserClusterHostResponseBody setNewHostId(String newHostId) {
        this.newHostId = newHostId;
        return this;
    }
    public String getNewHostId() {
        return this.newHostId;
    }

}
