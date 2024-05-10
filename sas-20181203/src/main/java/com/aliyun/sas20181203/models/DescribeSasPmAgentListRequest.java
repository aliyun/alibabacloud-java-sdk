// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSasPmAgentListRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeSasPmAgentListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSasPmAgentListRequest self = new DescribeSasPmAgentListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSasPmAgentListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSasPmAgentListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
