// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GenerateCLICommandShrinkRequest extends TeaModel {
    /**
     * <p>Enable aggregation. If enabled, the CLI automatically reads full data using pagination and aggregates the results.</p>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>You can use this option only with List operations that support pagination.</p>
     * <ul>
     * <li><p>true: Enable</p>
     * </li>
     * <li><p>false: Disable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("aggregatePagination")
    public Boolean aggregatePagination;

    /**
     * <p>API name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribeRegions</p>
     */
    @NameInMap("api")
    public String api;

    /**
     * <p>Request parameters.</p>
     */
    @NameInMap("apiParams")
    @Deprecated
    public String apiParamsShrink;

    /**
     * <p>API version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-05-26</p>
     */
    @NameInMap("apiVersion")
    public String apiVersion;

    /**
     * <p>API input parameters in JSON format. This parameter has lower priority than apiParams. If you set apiParams, this parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;InstanceChargeType&quot;: &quot;PostPaid&quot;,
     *     &quot;ResourceType&quot;: &quot;instance&quot;,
     *     &quot;AcceptLanguage&quot;: &quot;en-US&quot;
     * }</p>
     */
    @NameInMap("jsonApiParams")
    public String jsonApiParams;

    /**
     * <p>Product code.</p>
     * <ul>
     * <li><p>Call the GetRequestLog operation and get the product code from the response.</p>
     * </li>
     * <li><p>Find the product code in the OpenAPI portal URL. For example, the OpenAPI portal URL for Short Message Service is https\://api.aliyun.com/product/Dysmsapi. The product code for Short Message Service is Dysmsapi. In international regions, the URL is https\://api.alibabacloud.com/product/Dysmsapi. The product code remains Dysmsapi.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("product")
    public String product;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GenerateCLICommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCLICommandShrinkRequest self = new GenerateCLICommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCLICommandShrinkRequest setAggregatePagination(Boolean aggregatePagination) {
        this.aggregatePagination = aggregatePagination;
        return this;
    }
    public Boolean getAggregatePagination() {
        return this.aggregatePagination;
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
