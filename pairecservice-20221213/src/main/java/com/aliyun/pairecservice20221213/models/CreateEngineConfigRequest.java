// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateEngineConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <strong>example:</strong>
     * <p>pairec-cn-***test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>engine_config_v1</p>
     */
    @NameInMap("Name")
    public String name;

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

}
