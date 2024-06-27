// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class PermissionCheckRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegId")
    public String regId;

    public static PermissionCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        PermissionCheckRequest self = new PermissionCheckRequest();
        return TeaModel.build(map, self);
    }

    public PermissionCheckRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PermissionCheckRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
