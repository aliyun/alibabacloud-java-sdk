// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StopHoneypotRequest extends TeaModel {
    @NameInMap("HoneypotId")
    public String honeypotId;

    @NameInMap("Lang")
    public String lang;

    public static StopHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        StopHoneypotRequest self = new StopHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public StopHoneypotRequest setHoneypotId(String honeypotId) {
        this.honeypotId = honeypotId;
        return this;
    }
    public String getHoneypotId() {
        return this.honeypotId;
    }

    public StopHoneypotRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
