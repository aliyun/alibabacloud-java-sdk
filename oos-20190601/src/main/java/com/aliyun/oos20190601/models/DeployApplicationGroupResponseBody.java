// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeployApplicationGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeployApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationGroupResponseBody self = new DeployApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
