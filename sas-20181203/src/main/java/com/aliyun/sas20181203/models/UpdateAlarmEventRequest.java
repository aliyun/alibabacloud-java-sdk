// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateAlarmEventRequest extends TeaModel {
    /**
     * <p>The IDs of the alert events.</p>
     */
    @NameInMap("AlarmEventIdList")
    public java.util.List<Long> alarmEventIdList;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operation that you want to perform on the alert events. Valid values:</p>
     * <br>
     * <p>*   **manual_handled**: handle the alert events.</p>
     * <p>*   **ignore**: igore the alert events.</p>
     * <p>*   **cancel_ignore**: remove the alert events from the whitelist.</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    public static UpdateAlarmEventRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmEventRequest self = new UpdateAlarmEventRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmEventRequest setAlarmEventIdList(java.util.List<Long> alarmEventIdList) {
        this.alarmEventIdList = alarmEventIdList;
        return this;
    }
    public java.util.List<Long> getAlarmEventIdList() {
        return this.alarmEventIdList;
    }

    public UpdateAlarmEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAlarmEventRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

}
