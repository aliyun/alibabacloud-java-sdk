// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateEngineConfigRequest extends TeaModel {
    /**
     * <p>The content of the engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test config</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The runtime environment. Valid values:</p>
     * <ul>
     * <li><p>Daily: daily environment.</p>
     * </li>
     * <li><p>Pre: staging environment.</p>
     * </li>
     * <li><p>Prod: production environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID. You can obtain the ID from the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-***test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>engine_config_v1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateEngineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEngineConfigRequest self = new CreateEngineConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateEngineConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public CreateEngineConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEngineConfigRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateEngineConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEngineConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEngineConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
