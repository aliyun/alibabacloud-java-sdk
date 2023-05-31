// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotPresetRequest extends TeaModel {
    /**
     * <p>The name of the honeypot image.</p>
     */
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

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
     * <p>The ID of the management node to which you want to deploy honeypots.</p>
     * <br>
     * <p>> You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to query the IDs of management nodes.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The custom name of the honeypot template.</p>
     */
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
