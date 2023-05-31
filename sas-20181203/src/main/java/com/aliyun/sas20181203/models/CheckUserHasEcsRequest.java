// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckUserHasEcsRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static CheckUserHasEcsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserHasEcsRequest self = new CheckUserHasEcsRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserHasEcsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
