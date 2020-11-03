// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class CreateUisRequest extends TeaModel {
    @NameInMap("UisName")
    @Validation(required = true)
    public String uisName;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("Description")
    public String description;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static CreateUisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUisRequest self = new CreateUisRequest();
        return TeaModel.build(map, self);
    }

    public CreateUisRequest setUisName(String uisName) {
        this.uisName = uisName;
        return this;
    }
    public String getUisName() {
        return this.uisName;
    }

    public CreateUisRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateUisRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUisRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateUisRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateUisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
