// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class CreateSDKInstanceRequest extends TeaModel {
    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Recipe")
    public String recipe;

    @NameInMap("ValidFrom")
    public Long validFrom;

    @NameInMap("ValidTo")
    public Long validTo;

    public static CreateSDKInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSDKInstanceRequest self = new CreateSDKInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSDKInstanceRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateSDKInstanceRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public CreateSDKInstanceRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateSDKInstanceRequest setRecipe(String recipe) {
        this.recipe = recipe;
        return this;
    }
    public String getRecipe() {
        return this.recipe;
    }

    public CreateSDKInstanceRequest setValidFrom(Long validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public Long getValidFrom() {
        return this.validFrom;
    }

    public CreateSDKInstanceRequest setValidTo(Long validTo) {
        this.validTo = validTo;
        return this;
    }
    public Long getValidTo() {
        return this.validTo;
    }

}
