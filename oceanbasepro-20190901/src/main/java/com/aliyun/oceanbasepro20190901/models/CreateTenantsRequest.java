// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantsRequest extends TeaModel {
    // 字符集。 详细参见：DescribeCharset。
    @NameInMap("Charset")
    public String charset;

    @NameInMap("ClientToken")
    public String clientToken;

    // 租户的CPU大小，单位：核数（Cores）
    @NameInMap("Cpu")
    public Integer cpu;

    // 数据库描述信息。
    @NameInMap("Description")
    public String description;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户内存大小，单位GB。
    @NameInMap("Memory")
    public Integer memory;

    // 租户的主可用区。 其为集群部署可用区中的一个。
    @NameInMap("PrimaryZone")
    public String primaryZone;

    // 租户模式。 当前支持Oracle模式（Oracle）、MySQL模式（MySQL） 详细参见：DescribeInstanceTenantModes。
    @NameInMap("TenantMode")
    public String tenantMode;

    // 租户名称。 长度为2~20 个字符，支持英文字母、数字和下划线，区分大小写，必须以字母或下划线开头。 不可设置为 sys。
    @NameInMap("TenantName")
    public String tenantName;

    // 租户所在时区。 详细参见：DescribeTimeZones。
    @NameInMap("TimeZone")
    public String timeZone;

    // 租户的资源分布节点数。 其与集群的部署模式相耦合，如集群模式为2-2-2，则最后分布节点数最多为2个。
    @NameInMap("UnitNum")
    public Integer unitNum;

    // 虚拟交换机（VSwitch） ID。 如果没有合适的 VSwitch，请根据页面提示创建一个，详情参见 使用交换机。
    @NameInMap("UserVSwitchId")
    public String userVSwitchId;

    // 专有网络（VPC） ID。 如果没有合适的 VPC，请根据页面提示创建一个 VPC，详情参见 什么是专有网络
    @NameInMap("UserVpcId")
    public String userVpcId;

    public static CreateTenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantsRequest self = new CreateTenantsRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantsRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public CreateTenantsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTenantsRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateTenantsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTenantsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTenantsRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateTenantsRequest setPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    public CreateTenantsRequest setTenantMode(String tenantMode) {
        this.tenantMode = tenantMode;
        return this;
    }
    public String getTenantMode() {
        return this.tenantMode;
    }

    public CreateTenantsRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateTenantsRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreateTenantsRequest setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
        return this;
    }
    public Integer getUnitNum() {
        return this.unitNum;
    }

    public CreateTenantsRequest setUserVSwitchId(String userVSwitchId) {
        this.userVSwitchId = userVSwitchId;
        return this;
    }
    public String getUserVSwitchId() {
        return this.userVSwitchId;
    }

    public CreateTenantsRequest setUserVpcId(String userVpcId) {
        this.userVpcId = userVpcId;
        return this;
    }
    public String getUserVpcId() {
        return this.userVpcId;
    }

}
