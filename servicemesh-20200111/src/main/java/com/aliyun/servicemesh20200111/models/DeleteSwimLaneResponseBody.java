// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteSwimLaneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSwimLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimLaneResponseBody self = new DeleteSwimLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSwimLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
