// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class DeleteQuotaAlarmRequest extends TeaModel {
    /**
     * <p>The ID of the quota alert.</p>
     * <blockquote>
     * <p>For more information about how to obtain the ID of a quota alert, see <a href="https://help.aliyun.com/document_detail/440561.html">ListQuotaAlarms</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6b512ab7-da3a-4142-b529-2b2a9294****</p>
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
