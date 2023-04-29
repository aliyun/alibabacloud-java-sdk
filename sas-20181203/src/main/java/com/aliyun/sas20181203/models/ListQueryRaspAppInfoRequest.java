// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListQueryRaspAppInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Uuids")
    public String uuids;

    public static ListQueryRaspAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueryRaspAppInfoRequest self = new ListQueryRaspAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListQueryRaspAppInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListQueryRaspAppInfoRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
