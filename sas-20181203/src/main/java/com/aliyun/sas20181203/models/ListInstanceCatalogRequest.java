// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceCatalogRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static ListInstanceCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceCatalogRequest self = new ListInstanceCatalogRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceCatalogRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
