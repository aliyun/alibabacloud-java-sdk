// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceListRequest extends TeaModel {
    /**
     * <p>The ID of the protected resource. WAF automatically generates this ID when you add the resource to WAF.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/2839876.html">CreateCloudResource</a> to add a resource. Then, view the resource ID in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-8vbdlsd********81e22-80-ecs</p>
     */
    @NameInMap("CloudResourceId")
    public String cloudResourceId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. You do not need to specify this parameter for the first request.</p>
     * <blockquote>
     * <p>If a value is returned for this parameter, it indicates that a next page is available. To retrieve the next page of data, include the returned <strong>NextToken</strong> in your next request. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    /**
     * <p>The port of the cloud service that is added to WAF.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public String port;

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
     * <p>The ID of the resource instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-8vbdlsd********81e22</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The cloud service to which the resource belongs. Valid values:</p>
     * <ul>
     * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
     * </li>
     * <li><p><strong>mse</strong>: Microservices Engine (MSE).</p>
     * </li>
     * <li><p><strong>fc</strong>: Function Compute (FC).</p>
     * </li>
     * <li><p><strong>sae</strong>: Serverless App Engine (SAE).</p>
     * </li>
     * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS).</p>
     * </li>
     * <li><p><strong>clb4</strong>: Classic Load Balancer (CLB) that uses the TCP protocol.</p>
     * </li>
     * <li><p><strong>clb7</strong>: CLB that uses the HTTP or HTTPS protocol.</p>
     * </li>
     * <li><p><strong>apig</strong>: API Gateway (APIG).</p>
     * </li>
     * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Not all cloud services are available in all regions. If you specify this parameter, make sure that the specified cloud service is available in the selected region. Otherwise, the request may fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    public static DescribeCloudResourceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceListRequest self = new DescribeCloudResourceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceListRequest setCloudResourceId(String cloudResourceId) {
        this.cloudResourceId = cloudResourceId;
        return this;
    }
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    public DescribeCloudResourceListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCloudResourceListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCloudResourceListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudResourceListRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public DescribeCloudResourceListRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeCloudResourceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudResourceListRequest setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public DescribeCloudResourceListRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeCloudResourceListRequest setResourceProduct(String resourceProduct) {
        this.resourceProduct = resourceProduct;
        return this;
    }
    public String getResourceProduct() {
        return this.resourceProduct;
    }

}
