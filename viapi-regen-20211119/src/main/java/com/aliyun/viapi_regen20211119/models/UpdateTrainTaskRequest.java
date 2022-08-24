// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateTrainTaskRequest extends TeaModel {
    @NameInMap("AdvancedParameters")
    public String advancedParameters;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    public static UpdateTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainTaskRequest self = new UpdateTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrainTaskRequest setAdvancedParameters(String advancedParameters) {
        this.advancedParameters = advancedParameters;
        return this;
    }
    public String getAdvancedParameters() {
        return this.advancedParameters;
    }

    public UpdateTrainTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTrainTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTrainTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
