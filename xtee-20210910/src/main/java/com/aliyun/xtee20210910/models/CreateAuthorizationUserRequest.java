// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAuthorizationUserRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("bindId")
    public Long bindId;

    @NameInMap("createType")
    public String createType;

    @NameInMap("eventTemplateId")
    public Long eventTemplateId;

    @NameInMap("regId")
    public String regId;

    public static CreateAuthorizationUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationUserRequest self = new CreateAuthorizationUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationUserRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAuthorizationUserRequest setBindId(Long bindId) {
        this.bindId = bindId;
        return this;
    }
    public Long getBindId() {
        return this.bindId;
    }

    public CreateAuthorizationUserRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CreateAuthorizationUserRequest setEventTemplateId(Long eventTemplateId) {
        this.eventTemplateId = eventTemplateId;
        return this;
    }
    public Long getEventTemplateId() {
        return this.eventTemplateId;
    }

    public CreateAuthorizationUserRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
