// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListHoneypot~~">ListHoneypot</a> operation to query the IDs of honeypots.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>945607c2ae2a1a737c04599d6608065688bfc6048d9b9d306ce8dc8191c278b4</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    /**
     * <p>The custom name of the honeypot.</p>
     * 
     * <strong>example:</strong>
     * <p>ExtMail</p>
     */
    @NameInMap("HoneypotName")
    public String honeypotName;

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

    /**
     * <p>The custom configuration of the honeypot.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListAvailableHoneypot~~">ListAvailableHoneypot</a> operation to query the configurations of honeypots from the <strong>Template</strong> response parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;burp\&quot;:\&quot;open\&quot;,\&quot;webshell\&quot;:\&quot;open\&quot;,\&quot;trojan_git\&quot;:\&quot;close\&quot;,\&quot;portrait_option\&quot;:\&quot;true\&quot;}</p>
     */
    @NameInMap("Meta")
    public String meta;

    public static UpdateHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotRequest self = new UpdateHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotRequest setHoneypotId(String honeypotId) {
        this.honeypotId = honeypotId;
        return this;
    }
    public String getHoneypotId() {
        return this.honeypotId;
    }

    public UpdateHoneypotRequest setHoneypotName(String honeypotName) {
        this.honeypotName = honeypotName;
        return this;
    }
    public String getHoneypotName() {
        return this.honeypotName;
    }

    public UpdateHoneypotRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateHoneypotRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

}
