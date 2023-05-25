// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantRequest extends TeaModel {
    /**
     * <p>The description of the database.</p>
     */
    @NameInMap("Charset")
    public String charset;

    /**
     * <p>The number of resource distribution nodes in the tenant.    </p>
     * <p>The number is determined by the deployment mode of the cluster. If the cluster is deployed in 2-2-2 mode, the maximum number of resource distribution nodes is 2.</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>$.parameters[13].schema.example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the vSwitch.    </p>
     * <p>If no suitable vSwitch is available, create a vSwitch as prompted.   </p>
     * <p>For more information, see Use a vSwitch.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The return result of the request.</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>$.parameters[12].schema.enumValueTitles</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantMode")
    public String tenantMode;

    /**
     * <p>Alibaba Cloud CLI</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    /**
     * <p>The memory size of the tenant, in GB.   </p>
     * <br>
     * <p>> <br>The memory size of a single tenant cannot exceed that of the corresponding cluster. <br>For example, if the specification of the cluster is 14 CPU cores and 70 GB of memory, the memory size of the tenant cannot exceed 70 GB.</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <p>$.parameters[11].schema.description</p>
     */
    @NameInMap("UnitNum")
    public Integer unitNum;

    /**
     * <p>$.parameters[12].schema.description</p>
     */
    @NameInMap("UserVSwitchId")
    public String userVSwitchId;

    /**
     * <p>The time zone of the tenant.  For more information, see [DescribeTimeZones](https://help.aliyun.com/document_detail/410361.html).</p>
     */
    @NameInMap("UserVpcId")
    public String userVpcId;

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

}
