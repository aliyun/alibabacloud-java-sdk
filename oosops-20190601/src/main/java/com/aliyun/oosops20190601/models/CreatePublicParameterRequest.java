// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class CreatePublicParameterRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Constraints")
    public String constraints;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParameterType")
    public String parameterType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Value")
    public String value;

    public static CreatePublicParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicParameterRequest self = new CreatePublicParameterRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublicParameterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePublicParameterRequest setConstraints(String constraints) {
        this.constraints = constraints;
        return this;
    }
    public String getConstraints() {
        return this.constraints;
    }

    public CreatePublicParameterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePublicParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePublicParameterRequest setParameterType(String parameterType) {
        this.parameterType = parameterType;
        return this;
    }
    public String getParameterType() {
        return this.parameterType;
    }

    public CreatePublicParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePublicParameterRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
