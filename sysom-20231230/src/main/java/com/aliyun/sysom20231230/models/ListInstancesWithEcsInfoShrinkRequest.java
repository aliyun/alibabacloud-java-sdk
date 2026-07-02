// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstancesWithEcsInfoShrinkRequest extends TeaModel {
    /**
     * <p>The page number for pagination. This parameter specifies the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Integer current;

    /**
     * <p>Filters instances by health status.</p>
     * 
     * <strong>example:</strong>
     * <p>healthy</p>
     */
    @NameInMap("health_status")
    public String healthStatus;

    /**
     * <p>Specifies an instance ID to filter the Agent installation status of the specified instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp118piqcio9tiwgh84b</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    /**
     * <p>Filters instances by instance name or instance ID. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>84b</p>
     */
    @NameInMap("instance_id_name")
    public String instanceIdName;

    /**
     * <p>The name of the component instance.</p>
     * 
     * <strong>example:</strong>
     * <p>block-load-balancer-hjdm9</p>
     */
    @NameInMap("instance_name")
    public String instanceName;

    /**
     * <p>Filters instances by instance tag.</p>
     */
    @NameInMap("instance_tag")
    public String instanceTagShrink;

    /**
     * <p>Filters instances by management status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_managed")
    public Integer isManaged;

    /**
     * <p>Filters instances by operating system name.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud Linux  3.2104 LTS 64bit</p>
     */
    @NameInMap("os_name")
    public String osName;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filters instances by private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("private_ip")
    public String privateIp;

    /**
     * <p>Filters instances by public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("public_ip")
    public String publicIp;

    /**
     * <p>Filters instances by region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>Filters instances by resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxxxxx</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>Filters instances by resource group name or resource group ID. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("resource_group_id_name")
    public String resourceGroupIdName;

    /**
     * <p>Filters instances by resource group name.</p>
     * 
     * <strong>example:</strong>
     * <p>default resource group</p>
     */
    @NameInMap("resource_group_name")
    public String resourceGroupName;

    public static ListInstancesWithEcsInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesWithEcsInfoShrinkRequest self = new ListInstancesWithEcsInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesWithEcsInfoShrinkRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListInstancesWithEcsInfoShrinkRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public ListInstancesWithEcsInfoShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancesWithEcsInfoShrinkRequest setInstanceIdName(String instanceIdName) {
        this.instanceIdName = instanceIdName;
        return this;
    }
    public String getInstanceIdName() {
        return this.instanceIdName;
    }

    public ListInstancesWithEcsInfoShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListInstancesWithEcsInfoShrinkRequest setInstanceTagShrink(String instanceTagShrink) {
        this.instanceTagShrink = instanceTagShrink;
        return this;
    }
    public String getInstanceTagShrink() {
        return this.instanceTagShrink;
    }

    public ListInstancesWithEcsInfoShrinkRequest setIsManaged(Integer isManaged) {
        this.isManaged = isManaged;
        return this;
    }
    public Integer getIsManaged() {
        return this.isManaged;
    }

    public ListInstancesWithEcsInfoShrinkRequest setOsName(String osName) {
        this.osName = osName;
        return this;
    }
    public String getOsName() {
        return this.osName;
    }

    public ListInstancesWithEcsInfoShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesWithEcsInfoShrinkRequest setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public ListInstancesWithEcsInfoShrinkRequest setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public ListInstancesWithEcsInfoShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListInstancesWithEcsInfoShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstancesWithEcsInfoShrinkRequest setResourceGroupIdName(String resourceGroupIdName) {
        this.resourceGroupIdName = resourceGroupIdName;
        return this;
    }
    public String getResourceGroupIdName() {
        return this.resourceGroupIdName;
    }

    public ListInstancesWithEcsInfoShrinkRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
