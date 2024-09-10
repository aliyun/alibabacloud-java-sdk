// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartHoneypotRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListHoneypot~~">ListHoneypot</a> operation to query the IDs of honeypots.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dba7d44775be8e0e5888ee3b1a62554a93d2512247cabc38ddeac17a3b3f****</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    /**
     * <p>The language of the content in the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
