// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulConfigRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>emg</strong>: emergency vulnerability</li>
     * <li><strong>app</strong>: application vulnerability</li>
     * <li><strong>yum</strong>: YUM/APT source configuration</li>
     * <li><strong>scanMode</strong>: real risk</li>
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

    public ModifyVulConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
