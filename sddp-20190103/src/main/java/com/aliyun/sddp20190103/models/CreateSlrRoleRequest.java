// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateSlrRoleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static CreateSlrRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrRoleRequest self = new CreateSlrRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlrRoleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
