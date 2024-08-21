// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCInstanceResponseBody self = new DeleteRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
