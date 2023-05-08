// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotPresetRequest extends TeaModel {
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Meta")
    public String meta;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("PresetName")
    public String presetName;

    public static CreateHoneypotPresetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotPresetRequest self = new CreateHoneypotPresetRequest();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotPresetRequest setHoneypotImageName(String honeypotImageName) {
        this.honeypotImageName = honeypotImageName;
        return this;
    }
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    public CreateHoneypotPresetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateHoneypotPresetRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public CreateHoneypotPresetRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateHoneypotPresetRequest setPresetName(String presetName) {
        this.presetName = presetName;
        return this;
    }
    public String getPresetName() {
        return this.presetName;
    }

}
