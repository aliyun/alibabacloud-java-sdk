// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotStatisticsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static GetHoneypotStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotStatisticsRequest self = new GetHoneypotStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneypotStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
