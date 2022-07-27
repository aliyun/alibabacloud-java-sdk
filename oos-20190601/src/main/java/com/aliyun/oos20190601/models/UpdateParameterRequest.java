// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateParameterRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Value")
    public String value;

    public static UpdateParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterRequest self = new UpdateParameterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateParameterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateParameterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateParameterRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateParameterRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
