// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetRequest extends TeaModel {
    /**
     * <p>The configuration target. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>vulType</strong>: The vulnerability type. Valid values:<ul>
     * <li><strong>cve</strong>: Linux software vulnerability.</li>
     * <li><strong>sys</strong>: Windows system vulnerability.</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
     * <li><strong>emg</strong>: Emergency vulnerability.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;vulType\&quot;:\&quot;sys\&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The operation target. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>target</strong>: The UUID of the target machine.</li>
     * <li><strong>targetType</strong>: The target type. Fixed value: uuid.</li>
     * <li><strong>flag</strong>: The flag. Valid values:<ul>
     * <li><strong>add</strong>: Selected.</li>
     * <li><strong>del</strong>: Deselected.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;target\&quot;: \&quot;9cd5c684-7201-4de5-ad2c-cea89a5e****\&quot;, \&quot;targetType\&quot;: \&quot;uuid\&quot;, \&quot;flag\&quot;: \&quot;add\&quot;}]</p>
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
