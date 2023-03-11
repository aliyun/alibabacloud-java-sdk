// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetRequest extends TeaModel {
    /**
     * <p>The configurations. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **vulType**: the type of the vulnerabilities to scan. Valid values:</p>
     * <br>
     * <p>    *   **cve**: Linux software vulnerabilities</p>
     * <p>    *   **sys**: Windows system vulnerabilities</p>
     * <p>    *   **cms**: Web-CMS vulnerabilities</p>
     * <p>    *   **emg**: urgent vulnerabilities</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The operation. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **target**: the UUID of the server.</p>
     * <br>
     * <p>*   **targetType**: the application scope of the operation. Set the value to uuid.</p>
     * <br>
     * <p>*   **flag**: the type of the operation. Valid values:</p>
     * <br>
     * <p>    *   **add**: select</p>
     * <p>    *   **del**: deselect</p>
     */
    @NameInMap("Target")
    public String target;

    public static ModifyVulTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulTargetRequest self = new ModifyVulTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVulTargetRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyVulTargetRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
