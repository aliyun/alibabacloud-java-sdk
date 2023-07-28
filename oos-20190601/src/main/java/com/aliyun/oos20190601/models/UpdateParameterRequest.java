// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateParameterRequest extends TeaModel {
    /**
     * <p>The ID of the common parameter.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The data type of the common parameter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The version number of the common parameter.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The operation that you want to perform. Set the value to UpdateParameter.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the common parameter.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The value of the common parameter. The value must be 1 to 4096 characters in length.</p>
     */
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
