// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAppKeyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    public static CreateAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppKeyRequest self = new CreateAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAppKeyRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
