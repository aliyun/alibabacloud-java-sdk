// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-lbj****cn0c</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>11769793******</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The domain name. You can use this parameter if you set ResourceProduct to fc or sae.</p>
     * 
     * <strong>example:</strong>
     * <p>fc-domain-test</p>
     */
    @NameInMap("ResourceDomain")
    public String resourceDomain;

    /**
     * <p>The function name. You can use this parameter if you set ResourceProduct to fc.</p>
     * 
     * <strong>example:</strong>
     * <p>fc-test</p>
     */
    @NameInMap("ResourceFunction")
    public String resourceFunction;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-43glijk0fr****gths</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    @NameInMap("ResourceInstanceName")
    public String resourceInstanceName;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4gh****wela</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-name</p>
     */
    @NameInMap("ResourceName")
    @Deprecated
    public String resourceName;

    /**
     * <p>The cloud service to which the resource belongs. Valid values:</p>
     * <ul>
     * <li><strong>alb</strong>: Application Load Balancer (ALB).</li>
     * <li><strong>mse</strong>: Microservices Engine (MSE).</li>
     * <li><strong>fc</strong>: Function Compute.</li>
     * <li><strong>sae</strong>: Serverless App Engine (SAE).</li>
     * </ul>
     * <blockquote>
     * <p> Different cloud services are available in different regions. The specified cloud service must be available in the specified region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>alb</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    /**
     * <p>The region ID of the resource. For information about region IDs, see the following table.</p>
     * <blockquote>
     * <p> Different cloud services are available in different regions. The specified cloud service must be available in the specified region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The route name. You can use this parameter if you set ResourceProduct to mse.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-default-traffic</p>
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

    public DescribeCloudResourcesRequest setResourceInstanceName(String resourceInstanceName) {
        this.resourceInstanceName = resourceInstanceName;
        return this;
    }
    public String getResourceInstanceName() {
        return this.resourceInstanceName;
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
