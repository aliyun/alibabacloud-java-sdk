// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSasPmAgentListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

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
