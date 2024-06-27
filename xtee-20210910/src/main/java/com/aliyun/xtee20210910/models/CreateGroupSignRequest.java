// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateGroupSignRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignList")
    public String signList;

    @NameInMap("regId")
    public String regId;

    public static CreateGroupSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupSignRequest self = new CreateGroupSignRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupSignRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateGroupSignRequest setSignList(String signList) {
        this.signList = signList;
        return this;
    }
    public String getSignList() {
        return this.signList;
    }

    public CreateGroupSignRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
