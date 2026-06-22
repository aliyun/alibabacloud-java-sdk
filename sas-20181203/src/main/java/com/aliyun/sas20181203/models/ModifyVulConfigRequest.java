// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable vulnerability detection. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enable vulnerability detection.</li>
     * <li><strong>off</strong>: Disable vulnerability detection.</li>
     * </ul>
     * <blockquote>
     * <p>If the type is set to real risk, valid values:</p>
     * <ul>
     * <li><strong>real</strong>: Real risk vulnerabilities.</li>
     * <li><strong>all</strong>: All vulnerabilities.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The type of vulnerability to modify. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux vulnerability</li>
     * <li><strong>sys</strong>: Windows vulnerability</li>
     * <li><strong>cms</strong>: WebCMS vulnerability</li>
     * <li><strong>emg</strong>: emergency vulnerability</li>
     * <li><strong>app</strong>: application vulnerability</li>
     * <li><strong>yum</strong>: YUM/APT source configuration</li>
     * <li><strong>scanMode</strong>: real risk.</li>
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
