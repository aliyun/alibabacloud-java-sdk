// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateSwimLaneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSwimLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSwimLaneResponseBody self = new CreateSwimLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSwimLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
