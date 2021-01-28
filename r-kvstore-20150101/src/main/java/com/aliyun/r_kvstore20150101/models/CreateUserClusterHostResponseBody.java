// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateUserClusterHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostId")
    public String hostId;

    public static CreateUserClusterHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserClusterHostResponseBody self = new CreateUserClusterHostResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserClusterHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserClusterHostResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateUserClusterHostResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

}
