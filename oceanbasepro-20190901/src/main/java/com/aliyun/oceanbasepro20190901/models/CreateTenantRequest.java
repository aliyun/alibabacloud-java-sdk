// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantRequest extends TeaModel {
    /**
     * <p>The character set.    </p>
     * <p>For more information, see [DescribeCharset](https://www.alibabacloud.com/help/en/apsaradb-for-oceanbase/latest/api-oceanbasepro-2019-09-01-describecharset).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Charset")
    public String charset;

    /**
     * <p>The number of CPU cores of the tenant.   </p>
     * <br>
     * <p>> <br>The CPU specification of a single tenant cannot exceed that of the corresponding cluster. <br>For example, if the specification of the cluster is 14 CPU cores and 70 GB of memory, the CPU specification of the tenant cannot exceed 14 cores.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("CreateParams")
    public java.util.Map<String, String> createParams;

    /**
     * <p>The description of the database.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The size of the log disk allocated to the tenant, in GB.</p>
     */
    @NameInMap("LogDisk")
    public Long logDisk;

    /**
     * <p>The memory size of the tenant, in GB.   </p>
     * <br>
     * <p>> <br>The memory size of a single tenant cannot exceed that of the corresponding cluster. <br>For example, if the specification of the cluster is 14 CPU cores and 70 GB of memory, the memory size of the tenant cannot exceed 70 GB.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The primary zone of the tenant.    </p>
     * <p>It is one of the zones in which the cluster is deployed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    /**
     * <p>Specifies to create a read-only zone. Separate the names of multiple zones with commas (,).</p>
     * <p>>Notice: <br>At present, this parameter is unavailable.</p>
     */
    @NameInMap("ReadOnlyZoneList")
    public String readOnlyZoneList;

    /**
     * <p>The tenant mode.    </p>
     * <p>Valid values: Oracle and MySQL.   </p>
     * <p>For more information, see [DescribeInstanceTenantModes](https://www.alibabacloud.com/help/en/apsaradb-for-oceanbase/latest/api-oceanbasepro-2019-09-01-describeinstancetenantmodes).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantMode")
    public String tenantMode;

    /**
     * <p>The name of the tenant.    </p>
     * <p>It must start with a letter or an underscore (_), and contain 2 to 20 characters, which can be uppercase letters, lowercase letters, digits, and underscores (_).  It cannot be set to sys.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    /**
     * <p>The time zone of the tenant. For more information, see [DescribeTimeZones](https://www.alibabacloud.com/help/en/apsaradb-for-oceanbase/latest/api-oceanbasepro-2019-09-01-describetimezones).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <p>The number of resource distribution nodes in the tenant.    </p>
     * <p>The number is determined by the deployment mode of the cluster. If the cluster is deployed in 2-2-2 mode, the maximum number of resource distribution nodes is 2.</p>
     */
    @NameInMap("UnitNum")
    public Integer unitNum;

    /**
     * <p>The ID of the vSwitch.    </p>
     * <p>If no suitable vSwitch is available, create a vSwitch as prompted.   </p>
     * <p>For more information, see Use a vSwitch.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserVSwitchId")
    public String userVSwitchId;

    /**
     * <p>The ID of the VPC.   </p>
     * <p> If no suitable VPC is available, create a VPC as prompted.   </p>
     * <p>For more information, see "What is a VPC".</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserVpcId")
    public String userVpcId;

    @NameInMap("UserVpcOwnerId")
    public String userVpcOwnerId;

    public static CreateTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantRequest self = new CreateTenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public CreateTenantRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateTenantRequest setCreateParams(java.util.Map<String, String> createParams) {
        this.createParams = createParams;
        return this;
    }
    public java.util.Map<String, String> getCreateParams() {
        return this.createParams;
    }

    public CreateTenantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTenantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTenantRequest setLogDisk(Long logDisk) {
        this.logDisk = logDisk;
        return this;
    }
    public Long getLogDisk() {
        return this.logDisk;
    }

    public CreateTenantRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateTenantRequest setPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    public CreateTenantRequest setReadOnlyZoneList(String readOnlyZoneList) {
        this.readOnlyZoneList = readOnlyZoneList;
        return this;
    }
    public String getReadOnlyZoneList() {
        return this.readOnlyZoneList;
    }

    public CreateTenantRequest setTenantMode(String tenantMode) {
        this.tenantMode = tenantMode;
        return this;
    }
    public String getTenantMode() {
        return this.tenantMode;
    }

    public CreateTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateTenantRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreateTenantRequest setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
        return this;
    }
    public Integer getUnitNum() {
        return this.unitNum;
    }

    public CreateTenantRequest setUserVSwitchId(String userVSwitchId) {
        this.userVSwitchId = userVSwitchId;
        return this;
    }
    public String getUserVSwitchId() {
        return this.userVSwitchId;
    }

    public CreateTenantRequest setUserVpcId(String userVpcId) {
        this.userVpcId = userVpcId;
        return this;
    }
    public String getUserVpcId() {
        return this.userVpcId;
    }

    public CreateTenantRequest setUserVpcOwnerId(String userVpcOwnerId) {
        this.userVpcOwnerId = userVpcOwnerId;
        return this;
    }
    public String getUserVpcOwnerId() {
        return this.userVpcOwnerId;
    }

}
