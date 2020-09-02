// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVSwitchRequest extends TeaModel {
    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("CidrBlock")
    @Validation(required = true)
    public String cidrBlock;

    @NameInMap("Ipv6CidrBlock")
    public Integer ipv6CidrBlock;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("VSwitchName")
    public String vSwitchName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateVSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchRequest self = new CreateVSwitchRequest();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateVSwitchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVSwitchRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateVSwitchRequest setIpv6CidrBlock(Integer ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public Integer getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public CreateVSwitchRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVSwitchRequest setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public CreateVSwitchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVSwitchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
