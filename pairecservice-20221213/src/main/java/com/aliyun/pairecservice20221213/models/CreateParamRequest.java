// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateParamRequest extends TeaModel {
    /**
     * <p>The environment to which the parameter belongs. Valid values:</p>
     * <ul>
     * <li>Daily: daily environment.</li>
     * <li>Pre: staging environment.</li>
     * <li>Prod: production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID. You can call the ListInstances operation to obtain the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The parameter name.</p>
     * 
     * <strong>example:</strong>
     * <p>home</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The scene ID. You can call the ListScenes operation to obtain the scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The parameter type. Valid values:</p>
     * <ul>
     * <li><p>Normal: common parameter.</p>
     * </li>
     * <li><p>Encryption: encrypted parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>house</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateParamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParamRequest self = new CreateParamRequest();
        return TeaModel.build(map, self);
    }

    public CreateParamRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateParamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateParamRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateParamRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateParamRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateParamRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
