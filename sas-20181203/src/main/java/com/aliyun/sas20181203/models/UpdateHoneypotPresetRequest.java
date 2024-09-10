// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotPresetRequest extends TeaModel {
    /**
     * <p>The name of the image that is used for the honeypot.</p>
     * 
     * <strong>example:</strong>
     * <p>metabase</p>
     */
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    /**
     * <p>The ID of the honeypot template.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListHoneypotPreset~~">ListHoneypotPreset</a> operation to query the IDs of honeypot templates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f75eddce-e9d3-4a88-af95-b10b6f65xxxx</p>
     */
    @NameInMap("HoneypotPresetId")
    public String honeypotPresetId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The custom configurations of the honeypot template. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><strong>portrait_option</strong>: Social Source Tracing</li>
     * <li><strong>burp</strong>: Burp-specific Defense</li>
     * <li><strong>trojan_git</strong>: Git-specific Defense</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;portrait_option&quot;:true,&quot;burp&quot;:&quot;open&quot;}</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <p>The custom name of the honeypot template.</p>
     * 
     * <strong>example:</strong>
     * <p>apc_web_python</p>
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
