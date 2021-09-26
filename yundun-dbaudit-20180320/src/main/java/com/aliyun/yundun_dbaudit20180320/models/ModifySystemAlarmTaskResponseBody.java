// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifySystemAlarmTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySystemAlarmTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemAlarmTaskResponseBody self = new ModifySystemAlarmTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySystemAlarmTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
