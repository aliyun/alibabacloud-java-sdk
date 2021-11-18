// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class VSwitch extends TeaModel {
    // 可用ip数量
    @NameInMap("AvailableIpAddressCount")
    public Long availableIpAddressCount;

    // 子网
    @NameInMap("CidrBlock")
    public String cidrBlock;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 描述
    @NameInMap("Description")
    public String description;

    // 是否默认
    @NameInMap("IsDefault")
    public Boolean isDefault;

    // 状态
    @NameInMap("Status")
    public String status;

    // VSwitch Id
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // 名称
    @NameInMap("VSwitchName")
    public String vSwitchName;

    // vpc id
    @NameInMap("VpcId")
    public String vpcId;

    // 可用区
    @NameInMap("ZoneId")
    public String zoneId;

    public static VSwitch build(java.util.Map<String, ?> map) throws Exception {
        VSwitch self = new VSwitch();
        return TeaModel.build(map, self);
    }

    public VSwitch setAvailableIpAddressCount(Long availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
        return this;
    }
    public Long getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    public VSwitch setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public VSwitch setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public VSwitch setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VSwitch setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public VSwitch setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VSwitch setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public VSwitch setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public VSwitch setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public VSwitch setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
