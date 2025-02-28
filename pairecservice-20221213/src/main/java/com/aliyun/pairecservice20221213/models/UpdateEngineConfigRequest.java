// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateEngineConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;ListenConf&quot;: {
     *         &quot;HttpAddr&quot;: &quot;&quot;,
     *         &quot;HttpPort&quot;: 8000
     *     }
     * }</p>
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

    public static UpdateEngineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEngineConfigRequest self = new UpdateEngineConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEngineConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public UpdateEngineConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEngineConfigRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public UpdateEngineConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEngineConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
