// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRCInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCInstancesResponseBody self = new DeleteRCInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
