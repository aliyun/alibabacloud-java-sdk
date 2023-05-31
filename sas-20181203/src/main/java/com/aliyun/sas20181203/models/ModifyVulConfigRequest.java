// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the vulnerability scan feature. Valid values:</p>
     * <br>
     * <p>*   **on**: enables the feature</p>
     * <p>*   **off**: disables the feature</p>
     * <br>
     * <p>> Valid values when you set the Type parameter to scanMode:</p>
     * <br>
     * <p>*   **real**: displays only easily exploitable vulnerabilities.</p>
     * <br>
     * <p>*   **all**: displays all vulnerabilities.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     * <p>*   **cms**: Web-CMS vulnerability</p>
     * <p>*   **emg**: urgent vulnerability</p>
     * <p>*   **app**: application vulnerability</p>
     * <p>*   **yum**: YUM and APT source configuration</p>
     * <p>*   **scanMode**: easily exploitable vulnerability</p>
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
