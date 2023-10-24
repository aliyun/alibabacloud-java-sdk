// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot.</p>
     * <br>
     * <p>>  You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    /**
     * <p>The custom name of the honeypot.</p>
     */
    @NameInMap("HoneypotName")
    public String honeypotName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The custom configuration of the honeypot.</p>
     * <br>
     * <p>> You can call the [ListAvailableHoneypot](~~ListAvailableHoneypot~~) operation to query the configurations of honeypots from the **Template** response parameter.</p>
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
