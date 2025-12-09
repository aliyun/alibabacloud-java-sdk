// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GenerateCLICommandRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("api")
    public String api;

    @NameInMap("apiParams")
    @Deprecated
    public java.util.Map<String, ?> apiParams;

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

    public static GenerateCLICommandRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCLICommandRequest self = new GenerateCLICommandRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCLICommandRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    @Deprecated
    public GenerateCLICommandRequest setApiParams(java.util.Map<String, ?> apiParams) {
        this.apiParams = apiParams;
        return this;
    }
    public java.util.Map<String, ?> getApiParams() {
        return this.apiParams;
    }

    public GenerateCLICommandRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GenerateCLICommandRequest setJsonApiParams(String jsonApiParams) {
        this.jsonApiParams = jsonApiParams;
        return this;
    }
    public String getJsonApiParams() {
        return this.jsonApiParams;
    }

    public GenerateCLICommandRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GenerateCLICommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
