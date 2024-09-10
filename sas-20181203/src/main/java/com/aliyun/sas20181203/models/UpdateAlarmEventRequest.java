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
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operation that you want to perform on the alert events. Valid values:</p>
     * <ul>
     * <li><strong>manual_handled</strong>: handle the alert events.</li>
     * <li><strong>ignore</strong>: igore the alert events.</li>
     * <li><strong>cancel_ignore</strong>: remove the alert events from the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
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
