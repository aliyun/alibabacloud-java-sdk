// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSwitchRegionDetailRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
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
