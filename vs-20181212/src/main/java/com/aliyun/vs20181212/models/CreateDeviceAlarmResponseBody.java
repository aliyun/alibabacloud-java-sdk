// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceAlarmResponseBody extends TeaModel {
    @NameInMap("AlarmId")
    public String alarmId;

    @NameInMap("Expire")
    public Long expire;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AlarmDelay")
    public Long alarmDelay;

    @NameInMap("Url")
    public String url;

    public static CreateDeviceAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceAlarmResponseBody self = new CreateDeviceAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceAlarmResponseBody setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

    public CreateDeviceAlarmResponseBody setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public CreateDeviceAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceAlarmResponseBody setAlarmDelay(Long alarmDelay) {
        this.alarmDelay = alarmDelay;
        return this;
    }
    public Long getAlarmDelay() {
        return this.alarmDelay;
    }

    public CreateDeviceAlarmResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
