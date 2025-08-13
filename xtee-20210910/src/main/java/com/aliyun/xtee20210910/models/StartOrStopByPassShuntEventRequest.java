// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class StartOrStopByPassShuntEventRequest extends TeaModel {
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
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public String status;

    public static StartOrStopByPassShuntEventRequest build(java.util.Map<String, ?> map) throws Exception {
        StartOrStopByPassShuntEventRequest self = new StartOrStopByPassShuntEventRequest();
        return TeaModel.build(map, self);
    }

    public StartOrStopByPassShuntEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public StartOrStopByPassShuntEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public StartOrStopByPassShuntEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public StartOrStopByPassShuntEventRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
