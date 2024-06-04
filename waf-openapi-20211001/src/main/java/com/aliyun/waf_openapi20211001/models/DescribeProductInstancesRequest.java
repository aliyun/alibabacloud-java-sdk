// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeProductInstancesRequest extends TeaModel {
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
     * <p>The ID of the instance.</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <p>The public IP address of the instance.</p>
     */
    @NameInMap("ResourceIp")
    public String resourceIp;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The cloud service to which the instance belongs. Valid values:</p>
     * <br>
     * <p>*   **clb4**: Layer 4 Classic Load Balancer (CLB).</p>
     * <p>*   **clb7**: Layer 7 CLB.</p>
     * <p>*   **ecs**: Elastic Compute Service (ECS).</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    /**
     * <p>The region ID of the instance. Valid values:</p>
     * <br>
     * <p>*   **cn-chengdu**: China (Chengdu).</p>
     * <p>*   **cn-beijing**: China (Beijing).</p>
     * <p>*   **cn-zhangjiakou**: China (Zhangjiakou).</p>
     * <p>*   **cn-hangzhou**: China (Hangzhou).</p>
     * <p>*   **cn-shanghai**: China (Shanghai).</p>
     * <p>*   **cn-shenzhen**: China (Shenzhen).</p>
     * <p>*   **cn-qingdao**: China (Qingdao).</p>
     * <p>*   **cn-hongkong**: China (Hong Kong).</p>
     * <p>*   **ap-southeast-3**: Malaysia (Kuala Lumpur).</p>
     * <p>*   **ap-southeast-5**: Indonesia (Jakarta).</p>
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
