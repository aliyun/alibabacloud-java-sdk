// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneEngineConfigRequest extends TeaModel {
    /**
     * <p>The content of the engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    @NameInMap("Description")
    public String description;

    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li><p>Daily: The daily environment.</p>
     * </li>
     * <li><p>Pre: The pre-release environment.</p>
     * </li>
     * <li><p>Prod: The production environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID. To obtain an instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CloneEngineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneEngineConfigRequest self = new CloneEngineConfigRequest();
        return TeaModel.build(map, self);
    }

    public CloneEngineConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public CloneEngineConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CloneEngineConfigRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CloneEngineConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
