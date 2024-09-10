// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ResetHoneypotRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListHoneypot~~">ListHoneypot</a> operation to query the IDs of honeypots.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>945607c2ae2a1a737c04599d6608065688bfc6048d9b9d306ce8dc8191c*****</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
