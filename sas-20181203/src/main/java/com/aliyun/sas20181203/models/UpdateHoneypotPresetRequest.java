// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotPresetRequest extends TeaModel {
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    @NameInMap("HoneypotPresetId")
    public String honeypotPresetId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Meta")
    public String meta;

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
