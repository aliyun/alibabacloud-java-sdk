// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-lbj****cn0c</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The UID of the account to which the resource belongs.</p>
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
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The domain name of the resource. This parameter is available when you query FC or SAE resources.</p>
     * 
     * <strong>example:</strong>
     * <p>fc-domain-test</p>
     */
    @NameInMap("ResourceDomain")
    public String resourceDomain;

    /**
     * <p>The name of the function. This parameter is available when you query FC resources.</p>
     * 
     * <strong>example:</strong>
     * <p>fc-test</p>
     */
    @NameInMap("ResourceFunction")
    public String resourceFunction;

    /**
     * <p>The ID of the resource instance.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-43glijk0fr****gths</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <p>The name of the instance that is added to WAF.</p>
     * 
     * <strong>example:</strong>
     * <p>test-name</p>
     */
    @NameInMap("ResourceInstanceName")
    public String resourceInstanceName;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4gh****wela</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the resource instance.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-name</p>
     */
    @NameInMap("ResourceName")
    @Deprecated
    public String resourceName;

    /**
     * <p>The cloud service to which the resource belongs. By default, instances of Application Load Balancer (ALB), Microservices Engine (MSE), Function Compute (FC), and Serverless App Engine (SAE) are returned. Valid values:</p>
     * <ul>
     * <li><p><strong>alb</strong>: ALB</p>
     * </li>
     * <li><p><strong>mse</strong>: MSE</p>
     * </li>
     * <li><p><strong>fc</strong>: FC</p>
     * </li>
     * <li><p><strong>sae</strong>: SAE</p>
     * </li>
     * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS)</p>
     * </li>
     * <li><p><strong>clb4</strong>: Classic Load Balancer (CLB) that uses TCP</p>
     * </li>
     * <li><p><strong>clb7</strong>: CLB that uses HTTP or HTTPS</p>
     * </li>
     * <li><p><strong>nlb</strong>: Network Load Balancer (NLB)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Each cloud service supports different regions. If you specify this parameter, make sure the region you specify for the ResourceRegionId parameter supports this service. Otherwise, the query may fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>alb</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    /**
     * <p>The ID of the region where the resource resides. For more information, see the &quot;Regions and supported products&quot; section in this topic.</p>
     * <blockquote>
     * <p>Each cloud service supports different regions. If you specify the ResourceProduct parameter, make sure the region you specify for this parameter supports that service. Otherwise, the query may fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The name of the route. This parameter is available when you query MSE resources.</p>
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

    @Deprecated
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
