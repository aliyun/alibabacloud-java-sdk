// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateLayerRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LaboratoryId")
    public String laboratoryId;

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
