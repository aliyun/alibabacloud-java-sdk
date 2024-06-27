// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateEventRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("eventName")
    public String eventName;

    @NameInMap("inputFieldsStr")
    public String inputFieldsStr;

    @NameInMap("memo")
    public String memo;

    @NameInMap("regId")
    public String regId;

    @NameInMap("templateCode")
    public String templateCode;

    @NameInMap("templateName")
    public String templateName;

    @NameInMap("templateType")
    public String templateType;

    public static CreateEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventRequest self = new CreateEventRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateEventRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CreateEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CreateEventRequest setInputFieldsStr(String inputFieldsStr) {
        this.inputFieldsStr = inputFieldsStr;
        return this;
    }
    public String getInputFieldsStr() {
        return this.inputFieldsStr;
    }

    public CreateEventRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateEventRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CreateEventRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateEventRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
