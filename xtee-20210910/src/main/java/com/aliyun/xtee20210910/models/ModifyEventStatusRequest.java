// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyEventStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("fromEventSatus")
    public String fromEventSatus;

    @NameInMap("regId")
    public String regId;

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
