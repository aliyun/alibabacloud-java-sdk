// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotPresetRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot template.</p>
     * <br>
     * <p>> You can call the [ListHoneypotPreset](~~ListHoneypotPreset~~) operation to query the IDs of honeypot templates.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HoneypotPresetId")
    public String honeypotPresetId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese.</p>
     * <p>*   **en**: English.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DeleteHoneypotPresetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotPresetRequest self = new DeleteHoneypotPresetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotPresetRequest setHoneypotPresetId(String honeypotPresetId) {
        this.honeypotPresetId = honeypotPresetId;
        return this;
    }
    public String getHoneypotPresetId() {
        return this.honeypotPresetId;
    }

    public DeleteHoneypotPresetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
