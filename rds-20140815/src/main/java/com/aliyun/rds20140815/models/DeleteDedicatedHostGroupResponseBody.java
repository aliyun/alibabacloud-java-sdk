// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDedicatedHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostGroupResponseBody self = new DeleteDedicatedHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
