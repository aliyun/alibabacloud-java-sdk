// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaAlarmResponseBody extends TeaModel {
    @NameInMap("AlarmId")
    public String alarmId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateQuotaAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaAlarmResponseBody self = new CreateQuotaAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaAlarmResponseBody setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

    public CreateQuotaAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
