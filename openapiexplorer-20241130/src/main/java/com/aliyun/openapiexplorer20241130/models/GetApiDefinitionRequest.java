// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetApiDefinitionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribeRegions</p>
     */
    @NameInMap("api")
    public String api;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-05-26</p>
     */
    @NameInMap("apiVersion")
    public String apiVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("product")
    public String product;

    public static GetApiDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiDefinitionRequest self = new GetApiDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public GetApiDefinitionRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public GetApiDefinitionRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetApiDefinitionRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
