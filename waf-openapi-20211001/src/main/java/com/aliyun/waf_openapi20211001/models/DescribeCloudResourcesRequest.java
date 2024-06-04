// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to query the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: Chinese mainland.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The domain name. You can use this parameter if you set ResourceProduct to fc or sae.</p>
     */
    @NameInMap("ResourceDomain")
    public String resourceDomain;

    /**
     * <p>The function name. You can use this parameter if you set ResourceProduct to fc.</p>
     */
    @NameInMap("ResourceFunction")
    public String resourceFunction;

    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the resource.</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The cloud service to which the resource belongs. Valid values:</p>
     * <br>
     * <p>*   **alb**: Application Load Balancer (ALB).</p>
     * <p>*   **mse**: Microservices Engine (MSE).</p>
     * <p>*   **fc**: Function Compute.</p>
     * <p>*   **sae**: Serverless App Engine (SAE).</p>
     * <br>
     * <p>>  Different cloud services are available in different regions. The specified cloud service must be available in the specified region.</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    /**
     * <p>The region ID of the resource. For information about region IDs, see the following table.</p>
     * <br>
     * <p>>  Different cloud services are available in different regions. The specified cloud service must be available in the specified region.</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The route name. You can use this parameter if you set ResourceProduct to mse.</p>
     */
    @NameInMap("ResourceRouteName")
    public String resourceRouteName;

    public static DescribeCloudResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourcesRequest self = new DescribeCloudResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCloudResourcesRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public DescribeCloudResourcesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudResourcesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudResourcesRequest setResourceDomain(String resourceDomain) {
        this.resourceDomain = resourceDomain;
        return this;
    }
    public String getResourceDomain() {
        return this.resourceDomain;
    }

    public DescribeCloudResourcesRequest setResourceFunction(String resourceFunction) {
        this.resourceFunction = resourceFunction;
        return this;
    }
    public String getResourceFunction() {
        return this.resourceFunction;
    }

    public DescribeCloudResourcesRequest setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public DescribeCloudResourcesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeCloudResourcesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DescribeCloudResourcesRequest setResourceProduct(String resourceProduct) {
        this.resourceProduct = resourceProduct;
        return this;
    }
    public String getResourceProduct() {
        return this.resourceProduct;
    }

    public DescribeCloudResourcesRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public DescribeCloudResourcesRequest setResourceRouteName(String resourceRouteName) {
        this.resourceRouteName = resourceRouteName;
        return this;
    }
    public String getResourceRouteName() {
        return this.resourceRouteName;
    }

}
