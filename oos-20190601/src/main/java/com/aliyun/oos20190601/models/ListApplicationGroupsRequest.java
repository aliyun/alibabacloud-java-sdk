// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationGroupsRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApplication</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The ID of the region in which the related resources reside.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DeployRegionId")
    public String deployRegionId;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region. Set the value to cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the cloud resource.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2vcj9raxrhxb48zz3whw</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The code of the product to which the cloud resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    /**
     * <p>The type of the cloud resource.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListApplicationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationGroupsRequest self = new ListApplicationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationGroupsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListApplicationGroupsRequest setDeployRegionId(String deployRegionId) {
        this.deployRegionId = deployRegionId;
        return this;
    }
    public String getDeployRegionId() {
        return this.deployRegionId;
    }

    public ListApplicationGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListApplicationGroupsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListApplicationGroupsRequest setResourceProduct(String resourceProduct) {
        this.resourceProduct = resourceProduct;
        return this;
    }
    public String getResourceProduct() {
        return this.resourceProduct;
    }

    public ListApplicationGroupsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
