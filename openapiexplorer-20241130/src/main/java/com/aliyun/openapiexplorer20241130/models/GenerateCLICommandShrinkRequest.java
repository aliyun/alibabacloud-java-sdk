// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GenerateCLICommandShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("api")
    public String api;

    @NameInMap("apiParams")
    @Deprecated
    public String apiParamsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apiVersion")
    public String apiVersion;

    @NameInMap("jsonApiParams")
    public String jsonApiParams;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("product")
    public String product;

    @NameInMap("regionId")
    public String regionId;

    public static GenerateCLICommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCLICommandShrinkRequest self = new GenerateCLICommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCLICommandShrinkRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    @Deprecated
    public GenerateCLICommandShrinkRequest setApiParamsShrink(String apiParamsShrink) {
        this.apiParamsShrink = apiParamsShrink;
        return this;
    }
    public String getApiParamsShrink() {
        return this.apiParamsShrink;
    }

    public GenerateCLICommandShrinkRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GenerateCLICommandShrinkRequest setJsonApiParams(String jsonApiParams) {
        this.jsonApiParams = jsonApiParams;
        return this;
    }
    public String getJsonApiParams() {
        return this.jsonApiParams;
    }

    public GenerateCLICommandShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GenerateCLICommandShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
