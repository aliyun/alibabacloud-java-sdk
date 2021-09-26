// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyLogAlarmTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLogAlarmTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogAlarmTaskResponseBody self = new ModifyLogAlarmTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLogAlarmTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
