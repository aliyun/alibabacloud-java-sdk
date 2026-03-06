// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GenerateCLICommandRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable aggregation. If you enable this feature, the CLI automatically reads full data by page and aggregates the results.</p>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>Only List operations that support paging can use this switch.</p>
     * <ul>
     * <li><p>true: enables aggregation.</p>
     * </li>
     * <li><p>false: disables aggregation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("aggregatePagination")
    public Boolean aggregatePagination;

    /**
     * <p>The name of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribeRegions</p>
     */
    @NameInMap("api")
    public String api;

    /**
     * <p>The request parameters.</p>
     */
    @NameInMap("apiParams")
    @Deprecated
    public java.util.Map<String, ?> apiParams;

    /**
     * <p>The version of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-05-26</p>
     */
    @NameInMap("apiVersion")
    public String apiVersion;

    /**
     * <p>The request parameters for the API in JSON format. This parameter has a lower priority than \<code>apiParams\\</code>. If \<code>apiParams\\</code> is set, this parameter is ignored.</p>
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
     * <p>The product code.</p>
     * <ul>
     * <li><p>Call the GetRequestLog operation to obtain the product code from the response.</p>
     * </li>
     * <li><p>Find the product code in the URL of the product in OpenAPI Portal. For example, &lt;props=&quot;china&quot;&gt;the OpenAPI Portal URL for Short Message Service is https\://api.aliyun.com/product/Dysmsapi. The product code for Short Message Service is Dysmsapi.
     * &lt;props=&quot;intl&quot;&gt;the OpenAPI Portal URL for Short Message Service is https\://api.alibabacloud.com/product/Dysmsapi. The product code for Short Message Service is Dysmsapi.</p>
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
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GenerateCLICommandRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCLICommandRequest self = new GenerateCLICommandRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCLICommandRequest setAggregatePagination(Boolean aggregatePagination) {
        this.aggregatePagination = aggregatePagination;
        return this;
    }
    public Boolean getAggregatePagination() {
        return this.aggregatePagination;
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
