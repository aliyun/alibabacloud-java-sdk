// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebPathRequest extends TeaModel {
    /**
     * <p>The configuration of the web directory. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **webPathType**: the type of the web directory</p>
     * <p>*   **webPath**: the web directory</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The protected asset to which the web directory belongs. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **target**: the protected asset.</p>
     * <p>*   **targetType**: the type of the asset. Set the value to uuid.</p>
     * <p>*   **flag**: the type of the operation.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The type of the configuration item. Set the value to **web_path**.</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyWebPathRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPathRequest self = new ModifyWebPathRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebPathRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyWebPathRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ModifyWebPathRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
