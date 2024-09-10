// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StopHoneypotRequest extends TeaModel {
    /**
     * <p>The honeypot ID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListHoneypot~~">ListHoneypot</a> operation to obtain IDs of honeypots.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>444c699ac151b183b04b562b1dc02639d504c9d097246a322de75c963fe*****</p>
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
