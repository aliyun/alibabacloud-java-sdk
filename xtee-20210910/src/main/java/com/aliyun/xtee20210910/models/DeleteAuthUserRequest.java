// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteAuthUserRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("id")
    public Long id;

    @NameInMap("regId")
    public String regId;

    public static DeleteAuthUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthUserRequest self = new DeleteAuthUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuthUserRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteAuthUserRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DeleteAuthUserRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DeleteAuthUserRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteAuthUserRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
