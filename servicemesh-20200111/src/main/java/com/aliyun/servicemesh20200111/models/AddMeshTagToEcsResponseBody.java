// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddMeshTagToEcsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddMeshTagToEcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMeshTagToEcsResponseBody self = new AddMeshTagToEcsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMeshTagToEcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
