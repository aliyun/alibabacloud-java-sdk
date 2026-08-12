// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateEngineConfigRequest extends TeaModel {
    /**
     * <p>The content of the engine configuration.</p>
     * 
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

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>update config</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The runtime environment.</p>
     * <p>Valid values:</p>
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
     * <p>The instance ID. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-***test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The engine configuration name.</p>
     * 
     * <strong>example:</strong>
     * <p>engine_config_v1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The engine configuration type.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Type")
    public String type;

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

    public UpdateEngineConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
