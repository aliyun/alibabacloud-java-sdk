// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSwitchRegionDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static GetSwitchRegionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchRegionDetailRequest self = new GetSwitchRegionDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSwitchRegionDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
