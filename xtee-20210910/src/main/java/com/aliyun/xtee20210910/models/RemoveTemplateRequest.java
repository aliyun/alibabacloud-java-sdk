// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class RemoveTemplateRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("regId")
    public String regId;

    @NameInMap("templateId")
    public Long templateId;

    @NameInMap("version")
    public Integer version;

    public static RemoveTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTemplateRequest self = new RemoveTemplateRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTemplateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RemoveTemplateRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public RemoveTemplateRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public RemoveTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public RemoveTemplateRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
