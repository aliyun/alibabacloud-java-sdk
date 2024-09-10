// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the vulnerability scan feature. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables the feature</li>
     * <li><strong>off</strong>: disables the feature</li>
     * </ul>
     * <blockquote>
     * <p>Valid values when you set the Type parameter to scanMode:</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>real</strong>: displays only easily exploitable vulnerabilities.</p>
     * </li>
     * <li><p><strong>all</strong>: displays all vulnerabilities.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>emg</strong>: urgent vulnerability</li>
     * <li><strong>app</strong>: application vulnerability</li>
     * <li><strong>yum</strong>: YUM and APT source configuration</li>
     * <li><strong>scanMode</strong>: easily exploitable vulnerability</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyVulConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulConfigRequest self = new ModifyVulConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVulConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyVulConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
