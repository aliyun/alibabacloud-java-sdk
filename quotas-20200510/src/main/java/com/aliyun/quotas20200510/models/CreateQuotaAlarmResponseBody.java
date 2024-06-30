// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaAlarmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>18b3be23-b7b0-4d45-91bc-d0c331aa****</p>
     */
    @NameInMap("AlarmId")
    public String alarmId;

    /**
     * <strong>example:</strong>
     * <p>BD219E2B-E687-45EE-B5F3-61FB730551B1</p>
     */
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
