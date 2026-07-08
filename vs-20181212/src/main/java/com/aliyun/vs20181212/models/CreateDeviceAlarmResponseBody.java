// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceAlarmResponseBody extends TeaModel {
    /**
     * <p>下次相同告警的最小间隔。（单位：秒）</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("AlarmDelay")
    public Long alarmDelay;

    /**
     * <p>告警ID。</p>
     * 
     * <strong>example:</strong>
     * <p>0hyNgTdgv2D000195842</p>
     */
    @NameInMap("AlarmId")
    public String alarmId;

    /**
     * <p>URL的过期时长。（单位：秒）</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>76E11E6A-4441-51C9-AF60-D354362257A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>媒体上传的URL，可使用PUT上传。</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://demo.aliyundoc.com/live/310101<em><strong><strong>7542007?auth_key=1639130258-0-0-b2b04fe85ece6</strong></strong></em>a6b1a42bc7e</p>
     */
    @NameInMap("Url")
    public String url;

    public static CreateDeviceAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceAlarmResponseBody self = new CreateDeviceAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceAlarmResponseBody setAlarmDelay(Long alarmDelay) {
        this.alarmDelay = alarmDelay;
        return this;
    }
    public Long getAlarmDelay() {
        return this.alarmDelay;
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

    public CreateDeviceAlarmResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
