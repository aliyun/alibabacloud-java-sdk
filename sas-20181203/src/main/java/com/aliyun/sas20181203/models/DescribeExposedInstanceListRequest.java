// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceListRequest extends TeaModel {
    /**
     * <p>The server component that is exposed on the Internet.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The total number of servers that are exposed on the Internet.</p>
     */
    @NameInMap("ExposureComponent")
    public String exposureComponent;

    /**
     * <p>The ID of the region where the server resides.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("ExposureIp")
    public String exposureIp;

    /**
     * <p>The public IP address that is exposed on the Internet.</p>
     */
    @NameInMap("ExposurePort")
    public String exposurePort;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name of the server.</p>
     */
    @NameInMap("HealthStatus")
    public Boolean healthStatus;

    /**
     * <p>The UUID of the server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the server group.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The health status of the Elastic Compute Service (ECS) instance in the scaling group. ECS instances that are not in the Running state are considered unhealthy. Valid values:</p>
     * <br>
     * <p>*   Healthy</p>
     * <p>*   Unhealthy</p>
     * <br>
     * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.</p>
     * <br>
     * <p>Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the instance lifecycle. If the lifecycle of the ECS instances is not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release them. If the lifecycle of the ECS instances is managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases them.</p>
     * <br>
     * <p>>  Make sure that you have sufficient balance within your account. If you have overdue payments in your account, pay-as-you-go and preemptible instances are stopped or released. For information about how the status of ECS instances changes when you have overdue payments in your account, see [Overdue payments](~~170589~~).</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The public IP address of the server.</p>
     */
    @NameInMap("VulStatus")
    public Boolean vulStatus;

    public static DescribeExposedInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceListRequest self = new DescribeExposedInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeExposedInstanceListRequest setExposureComponent(String exposureComponent) {
        this.exposureComponent = exposureComponent;
        return this;
    }
    public String getExposureComponent() {
        return this.exposureComponent;
    }

    public DescribeExposedInstanceListRequest setExposureIp(String exposureIp) {
        this.exposureIp = exposureIp;
        return this;
    }
    public String getExposureIp() {
        return this.exposureIp;
    }

    public DescribeExposedInstanceListRequest setExposurePort(String exposurePort) {
        this.exposurePort = exposurePort;
        return this;
    }
    public String getExposurePort() {
        return this.exposurePort;
    }

    public DescribeExposedInstanceListRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeExposedInstanceListRequest setHealthStatus(Boolean healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public Boolean getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeExposedInstanceListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeExposedInstanceListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeExposedInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExposedInstanceListRequest setVulStatus(Boolean vulStatus) {
        this.vulStatus = vulStatus;
        return this;
    }
    public Boolean getVulStatus() {
        return this.vulStatus;
    }

}
