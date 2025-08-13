// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SaveByPassOrShuntEventRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>445</p>
     */
    @NameInMap("eventId")
    public Long eventId;

    /**
     * <p>Event name.</p>
     * 
     * <strong>example:</strong>
     * <p>注册事件</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <p>Event type</p>
     * 
     * <strong>example:</strong>
     * <p>MAIN</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static SaveByPassOrShuntEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveByPassOrShuntEventRequest self = new SaveByPassOrShuntEventRequest();
        return TeaModel.build(map, self);
    }

    public SaveByPassOrShuntEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveByPassOrShuntEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public SaveByPassOrShuntEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public SaveByPassOrShuntEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public SaveByPassOrShuntEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
