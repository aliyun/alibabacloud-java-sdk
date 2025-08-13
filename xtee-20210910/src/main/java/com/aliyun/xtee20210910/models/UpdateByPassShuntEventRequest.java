// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateByPassShuntEventRequest extends TeaModel {
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
     * <p>233</p>
     */
    @NameInMap("eventId")
    public Long eventId;

    /**
     * <p>Event name.</p>
     * 
     * <strong>example:</strong>
     * <p>用户昵称文本审核检测结果</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static UpdateByPassShuntEventRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateByPassShuntEventRequest self = new UpdateByPassShuntEventRequest();
        return TeaModel.build(map, self);
    }

    public UpdateByPassShuntEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateByPassShuntEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public UpdateByPassShuntEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public UpdateByPassShuntEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
