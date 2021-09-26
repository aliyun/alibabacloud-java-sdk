// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DeleteAlarmTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAlarmTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmTaskResponseBody self = new DeleteAlarmTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
