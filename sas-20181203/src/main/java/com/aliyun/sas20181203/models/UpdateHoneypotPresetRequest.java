// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotPresetRequest extends TeaModel {
    /**
     * <p>The name of the image that is used for the honeypot.</p>
     */
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    /**
     * <p>The ID of the honeypot template.</p>
     * <br>
     * <p>> You can call the [ListHoneypotPreset](~~ListHoneypotPreset~~) operation to query the IDs of honeypot templates.</p>
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

    /**
     * <p>The custom configurations of the honeypot template. The value is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **portrait_option**: Social Source Tracing</p>
     * <p>*   **burp**: Burp-specific Defense</p>
     * <p>*   **trojan_git**: Git-specific Defense</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <p>The custom name of the honeypot template.</p>
     */
    @NameInMap("PresetName")
    public String presetName;

    public static UpdateHoneypotPresetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotPresetRequest self = new UpdateHoneypotPresetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotPresetRequest setHoneypotImageName(String honeypotImageName) {
        this.honeypotImageName = honeypotImageName;
        return this;
    }
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    public UpdateHoneypotPresetRequest setHoneypotPresetId(String honeypotPresetId) {
        this.honeypotPresetId = honeypotPresetId;
        return this;
    }
    public String getHoneypotPresetId() {
        return this.honeypotPresetId;
    }

    public UpdateHoneypotPresetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateHoneypotPresetRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public UpdateHoneypotPresetRequest setPresetName(String presetName) {
        this.presetName = presetName;
        return this;
    }
    public String getPresetName() {
        return this.presetName;
    }

}
