// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteSwimLaneGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSwimLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimLaneGroupResponseBody self = new DeleteSwimLaneGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSwimLaneGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
