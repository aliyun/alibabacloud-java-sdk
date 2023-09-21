// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateAlarmEventResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAlarmEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmEventResponseBody self = new UpdateAlarmEventResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
