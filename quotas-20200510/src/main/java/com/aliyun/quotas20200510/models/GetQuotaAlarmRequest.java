// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaAlarmRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("AlarmId")
    public String alarmId;

    public static GetQuotaAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaAlarmRequest self = new GetQuotaAlarmRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaAlarmRequest setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

}
