// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClearLogstoreStorageRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("Lang")
    public String lang;

    public static ModifyClearLogstoreStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClearLogstoreStorageRequest self = new ModifyClearLogstoreStorageRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClearLogstoreStorageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ModifyClearLogstoreStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
