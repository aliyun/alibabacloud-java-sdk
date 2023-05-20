// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotPresetRequest extends TeaModel {
    @NameInMap("HoneypotPresetId")
    public String honeypotPresetId;

    @NameInMap("Lang")
    public String lang;

    public static GetHoneypotPresetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotPresetRequest self = new GetHoneypotPresetRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneypotPresetRequest setHoneypotPresetId(String honeypotPresetId) {
        this.honeypotPresetId = honeypotPresetId;
        return this;
    }
    public String getHoneypotPresetId() {
        return this.honeypotPresetId;
    }

    public GetHoneypotPresetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
