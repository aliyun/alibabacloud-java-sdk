// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyEventRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("bizVersion")
    public Integer bizVersion;

    @NameInMap("createType")
    public String createType;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("inputFieldsStr")
    public String inputFieldsStr;

    @NameInMap("memo")
    public String memo;

    @NameInMap("regId")
    public String regId;

    @NameInMap("templateType")
    public String templateType;

    public static ModifyEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventRequest self = new ModifyEventRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyEventRequest setBizVersion(Integer bizVersion) {
        this.bizVersion = bizVersion;
        return this;
    }
    public Integer getBizVersion() {
        return this.bizVersion;
    }

    public ModifyEventRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public ModifyEventRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ModifyEventRequest setInputFieldsStr(String inputFieldsStr) {
        this.inputFieldsStr = inputFieldsStr;
        return this;
    }
    public String getInputFieldsStr() {
        return this.inputFieldsStr;
    }

    public ModifyEventRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ModifyEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyEventRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
