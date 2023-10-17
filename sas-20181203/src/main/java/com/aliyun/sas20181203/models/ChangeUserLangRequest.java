// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeUserLangRequest extends TeaModel {
    /**
     * <p>The new language. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("UserLang")
    public String userLang;

    public static ChangeUserLangRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeUserLangRequest self = new ChangeUserLangRequest();
        return TeaModel.build(map, self);
    }

    public ChangeUserLangRequest setUserLang(String userLang) {
        this.userLang = userLang;
        return this;
    }
    public String getUserLang() {
        return this.userLang;
    }

}
