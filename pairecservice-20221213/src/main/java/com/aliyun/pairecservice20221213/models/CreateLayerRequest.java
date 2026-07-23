// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateLayerRequest extends TeaModel {
    /**
     * <p>The description of the layer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance. Call the <code>ListInstances</code> operation to obtain this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the laboratory. Call the <code>ListLaboratories</code> operation to obtain this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LaboratoryId")
    public String laboratoryId;

    /**
     * <p>The name of the layer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>layer1</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerRequest self = new CreateLayerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLayerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLayerRequest setLaboratoryId(String laboratoryId) {
        this.laboratoryId = laboratoryId;
        return this;
    }
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    public CreateLayerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
