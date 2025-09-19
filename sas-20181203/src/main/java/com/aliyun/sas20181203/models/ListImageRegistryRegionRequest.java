// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRegistryRegionRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static ListImageRegistryRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageRegistryRegionRequest self = new ListImageRegistryRegionRequest();
        return TeaModel.build(map, self);
    }

    public ListImageRegistryRegionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
