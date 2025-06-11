// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the OceanBase cluster. It must be 1 to 20 characters in length. If this parameter is not specified, the value is the instance ID of the cluster by default.</p>
     * 
     * <strong>example:</strong>
     * <p>ob4prod</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of the page to return.</p>
     * <ul>
     * <li>Pages start from page 1.</li>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows to return on each page.</p>
     * <ul>
     * <li>Maximum value: 100.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. If you do not specify this parameter, all resources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The keyword for fuzzy search, which can be an instance ID, instance name, tenant ID, or tenant name.</p>
     * 
     * <strong>example:</strong>
     * <p>pay</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("WithOBCloudInstances")
    public Boolean withOBCloudInstances;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeInstancesRequest setWithOBCloudInstances(Boolean withOBCloudInstances) {
        this.withOBCloudInstances = withOBCloudInstances;
        return this;
    }
    public Boolean getWithOBCloudInstances() {
        return this.withOBCloudInstances;
    }

}
