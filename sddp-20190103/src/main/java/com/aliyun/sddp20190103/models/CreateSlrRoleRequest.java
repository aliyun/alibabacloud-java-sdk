// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateSlrRoleRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Simplified Chinese</p>
     * <p>*   **en_us**: English</p>
     */
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
