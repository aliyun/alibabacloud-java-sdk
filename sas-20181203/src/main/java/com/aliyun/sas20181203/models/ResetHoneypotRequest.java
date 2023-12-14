// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ResetHoneypotRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot.</p>
     * <br>
     * <p>> You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <p>- **zh**: Chinese</p>
     * <p>- **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static ResetHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetHoneypotRequest self = new ResetHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public ResetHoneypotRequest setHoneypotId(String honeypotId) {
        this.honeypotId = honeypotId;
        return this;
    }
    public String getHoneypotId() {
        return this.honeypotId;
    }

    public ResetHoneypotRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
