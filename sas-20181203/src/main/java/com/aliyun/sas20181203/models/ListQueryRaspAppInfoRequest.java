// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListQueryRaspAppInfoRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**</p>
     * <p>*   **en**</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUIDs of the RASP-enabled applications. Separate multiple UUIDs with commas (,).</p>
     */
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
