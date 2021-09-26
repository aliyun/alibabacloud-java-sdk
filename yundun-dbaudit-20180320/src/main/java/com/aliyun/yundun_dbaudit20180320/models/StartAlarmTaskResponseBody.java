// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class StartAlarmTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartAlarmTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAlarmTaskResponseBody self = new StartAlarmTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAlarmTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
