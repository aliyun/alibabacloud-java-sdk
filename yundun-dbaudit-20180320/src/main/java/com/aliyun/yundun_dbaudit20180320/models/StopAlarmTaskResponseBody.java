// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class StopAlarmTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopAlarmTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAlarmTaskResponseBody self = new StopAlarmTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAlarmTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
