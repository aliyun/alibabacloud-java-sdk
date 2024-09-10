// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListQueryRaspAppInfoRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong></li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUIDs of the RASP-enabled applications. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>6541631a-7d47-41fd-9fef-9518113f****</p>
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
