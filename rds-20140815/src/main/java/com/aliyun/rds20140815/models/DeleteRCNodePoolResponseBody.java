// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCNodePoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRCNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCNodePoolResponseBody self = new DeleteRCNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
