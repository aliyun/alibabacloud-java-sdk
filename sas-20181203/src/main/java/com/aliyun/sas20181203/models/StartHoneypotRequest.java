// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartHoneypotRequest extends TeaModel {
    /**
     * <p>The honeypot ID.</p>
     * <br>
     * <p>>  You can call the [ListHoneypot](~~ListHoneypot~~) operation to obtain IDs of honeypots.</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static StartHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        StartHoneypotRequest self = new StartHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public StartHoneypotRequest setHoneypotId(String honeypotId) {
        this.honeypotId = honeypotId;
        return this;
    }
    public String getHoneypotId() {
        return this.honeypotId;
    }

    public StartHoneypotRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
