// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCDiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRCDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCDiskResponseBody self = new DeleteRCDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
