// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class RemoveLogMaskConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveLogMaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveLogMaskConfigResponseBody self = new RemoveLogMaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveLogMaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
