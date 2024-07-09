// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeProductInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-zxu****9d02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1704********9107</p>
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
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2zeugkfj81jvo****4tqm</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    @NameInMap("ResourceInstanceIp")
    public String resourceInstanceIp;

    @NameInMap("ResourceInstanceName")
    public String resourceInstanceName;

    /**
     * <p>The public IP address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1.X.X.1</p>
     */
    @NameInMap("ResourceIp")
    @Deprecated
    public String resourceIp;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz6ql****5uzi</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleResourceName</p>
     */
    @NameInMap("ResourceName")
    @Deprecated
    public String resourceName;

    /**
     * <p>The cloud service to which the instance belongs. Valid values:</p>
     * <ul>
     * <li><strong>clb4</strong>: Layer 4 Classic Load Balancer (CLB).</li>
     * <li><strong>clb7</strong>: Layer 7 CLB.</li>
     * <li><strong>ecs</strong>: Elastic Compute Service (ECS).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clb7</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    /**
     * <p>The region ID of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-chengdu</strong>: China (Chengdu).</li>
     * <li><strong>cn-beijing</strong>: China (Beijing).</li>
     * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou).</li>
     * <li><strong>cn-hangzhou</strong>: China (Hangzhou).</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai).</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen).</li>
     * <li><strong>cn-qingdao</strong>: China (Qingdao).</li>
     * <li><strong>cn-hongkong</strong>: China (Hong Kong).</li>
     * <li><strong>ap-southeast-3</strong>: Malaysia (Kuala Lumpur).</li>
     * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    public static DescribeProductInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductInstancesRequest self = new DescribeProductInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeProductInstancesRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public DescribeProductInstancesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProductInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeProductInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeProductInstancesRequest setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public DescribeProductInstancesRequest setResourceInstanceIp(String resourceInstanceIp) {
        this.resourceInstanceIp = resourceInstanceIp;
        return this;
    }
    public String getResourceInstanceIp() {
        return this.resourceInstanceIp;
    }

    public DescribeProductInstancesRequest setResourceInstanceName(String resourceInstanceName) {
        this.resourceInstanceName = resourceInstanceName;
        return this;
    }
    public String getResourceInstanceName() {
        return this.resourceInstanceName;
    }

    public DescribeProductInstancesRequest setResourceIp(String resourceIp) {
        this.resourceIp = resourceIp;
        return this;
    }
    public String getResourceIp() {
        return this.resourceIp;
    }

    public DescribeProductInstancesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeProductInstancesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DescribeProductInstancesRequest setResourceProduct(String resourceProduct) {
        this.resourceProduct = resourceProduct;
        return this;
    }
    public String getResourceProduct() {
        return this.resourceProduct;
    }

    public DescribeProductInstancesRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

}
