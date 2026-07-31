// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeProductInstancesRequest extends TeaModel {
    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-zxu****9d02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The UID of the resource ownership user.</p>
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
     * <p>The number of entries per page when paging. Default value: <strong>10</strong>.</p>
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
     * <p>The domain name that is added to WAF.</p>
     * <blockquote>
     * <p>This parameter is supported only when the cloud service type is ddos.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.c**sw.net">www.c**sw.net</a></p>
     */
    @NameInMap("ResourceDomain")
    public String resourceDomain;

    /**
     * <p>The WAF protection status.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("ResourceInstanceAccessStatus")
    public String resourceInstanceAccessStatus;

    /**
     * <p>The instance ID of the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2zeugkfj81jvo****4tqm</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <p>The IP address of the instance that is added to WAF.</p>
     * 
     * <strong>example:</strong>
     * <p>1.X.X.1</p>
     */
    @NameInMap("ResourceInstanceIp")
    public String resourceInstanceIp;

    /**
     * <p>The name of the instance that is added to WAF.</p>
     * 
     * <strong>example:</strong>
     * <p>demoInstanceName</p>
     */
    @NameInMap("ResourceInstanceName")
    public String resourceInstanceName;

    /**
     * <p>The public IP address of the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>1.X.X.1</p>
     */
    @NameInMap("ResourceIp")
    @Deprecated
    public String resourceIp;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz6ql****5uzi</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The instance name of the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleResourceName</p>
     */
    @NameInMap("ResourceName")
    @Deprecated
    public String resourceName;

    /**
     * <p>The type of the cloud service. Valid values:</p>
     * <ul>
     * <li><p><strong>clb4</strong>: Layer 4 CLB.</p>
     * </li>
     * <li><p><strong>clb7</strong>: Layer 7 CLB.</p>
     * </li>
     * <li><p><strong>ecs</strong>: ECS.</p>
     * </li>
     * <li><p><strong>nlb</strong>: NLB.</p>
     * </li>
     * <li><p><strong>ddos</strong>: Anti-DDoS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clb7</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    /**
     * <p>The region ID of the cloud service. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-chengdu</strong>: China Southwest 1 (Chengdu).</p>
     * </li>
     * <li><p><strong>cn-beijing</strong>: China North 2 (Beijing).</p>
     * </li>
     * <li><p><strong>cn-zhangjiakou</strong>: China North 3 (Zhangjiakou).</p>
     * </li>
     * <li><p><strong>cn-hangzhou</strong>: China East 1 (Hangzhou).</p>
     * </li>
     * <li><p><strong>cn-shanghai</strong>: China East 2 (Shanghai).</p>
     * </li>
     * <li><p><strong>cn-shenzhen</strong>: China South 1 (Shenzhen).</p>
     * </li>
     * <li><p><strong>cn-qingdao</strong>: China North 1 (Qingdao).</p>
     * </li>
     * <li><p><strong>cn-hongkong</strong>: Hong Kong (China).</p>
     * </li>
     * <li><p><strong>ap-southeast-3</strong>: Malaysia (Kuala Lumpur).</p>
     * </li>
     * <li><p><strong>ap-southeast-5</strong>: Indonesia (Jakarta).</p>
     * </li>
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

    public DescribeProductInstancesRequest setResourceDomain(String resourceDomain) {
        this.resourceDomain = resourceDomain;
        return this;
    }
    public String getResourceDomain() {
        return this.resourceDomain;
    }

    public DescribeProductInstancesRequest setResourceInstanceAccessStatus(String resourceInstanceAccessStatus) {
        this.resourceInstanceAccessStatus = resourceInstanceAccessStatus;
        return this;
    }
    public String getResourceInstanceAccessStatus() {
        return this.resourceInstanceAccessStatus;
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

    @Deprecated
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

    @Deprecated
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
