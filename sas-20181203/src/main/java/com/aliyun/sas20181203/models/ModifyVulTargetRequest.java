// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetRequest extends TeaModel {
    /**
     * <p>The configurations. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>vulType</strong>: the type of the vulnerabilities to scan. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerabilities</li>
     * <li><strong>sys</strong>: Windows system vulnerabilities</li>
     * <li><strong>cms</strong>: Web-CMS vulnerabilities</li>
     * <li><strong>emg</strong>: urgent vulnerabilities</li>
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
     * <p>The operation. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>target</strong>: the UUID of the server.</p>
     * </li>
     * <li><p><strong>targetType</strong>: the application scope of the operation. Set the value to uuid.</p>
     * </li>
     * <li><p><strong>flag</strong>: the type of the operation. Valid values:</p>
     * <ul>
     * <li><strong>add</strong>: select</li>
     * <li><strong>del</strong>: deselect</li>
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
