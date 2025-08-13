// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyEventStatusRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
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
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_aamexg3015</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Initial event status, to avoid duplicate submissions or historical replays</p>
     * 
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("fromEventSatus")
    public String fromEventSatus;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Updated event status</p>
     * 
     * <strong>example:</strong>
     * <p>OFFLINE</p>
     */
    @NameInMap("toEventSatus")
    public String toEventSatus;

    public static ModifyEventStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventStatusRequest self = new ModifyEventStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEventStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyEventStatusRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public ModifyEventStatusRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ModifyEventStatusRequest setFromEventSatus(String fromEventSatus) {
        this.fromEventSatus = fromEventSatus;
        return this;
    }
    public String getFromEventSatus() {
        return this.fromEventSatus;
    }

    public ModifyEventStatusRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyEventStatusRequest setToEventSatus(String toEventSatus) {
        this.toEventSatus = toEventSatus;
        return this;
    }
    public String getToEventSatus() {
        return this.toEventSatus;
    }

}
