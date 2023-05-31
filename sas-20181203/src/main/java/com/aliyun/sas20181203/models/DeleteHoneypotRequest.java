// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot.</p>
     * <br>
     * <p>> You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    @NameInMap("Lang")
    public String lang;

    public static DeleteHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotRequest self = new DeleteHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotRequest setHoneypotId(String honeypotId) {
        this.honeypotId = honeypotId;
        return this;
    }
    public String getHoneypotId() {
        return this.honeypotId;
    }

    public DeleteHoneypotRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
