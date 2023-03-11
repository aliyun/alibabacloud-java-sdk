// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryTypeRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static ListPrivateRegistryTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateRegistryTypeRequest self = new ListPrivateRegistryTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateRegistryTypeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
