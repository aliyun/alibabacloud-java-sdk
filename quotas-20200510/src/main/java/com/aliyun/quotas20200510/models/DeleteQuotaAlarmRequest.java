// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class DeleteQuotaAlarmRequest extends TeaModel {
    /**
     * <p>The ID of the quota alert.</p>
     */
    @NameInMap("AlarmId")
    public String alarmId;

    public static DeleteQuotaAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaAlarmRequest self = new DeleteQuotaAlarmRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaAlarmRequest setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

}
