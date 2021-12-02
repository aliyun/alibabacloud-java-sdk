// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewayAttributeResponseBody extends TeaModel {
    @NameInMap("BusinessStatus")
    public String businessStatus;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Ipv6GatewayId")
    public String ipv6GatewayId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("Status")
    public String status;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeIpv6GatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewayAttributeResponseBody self = new DescribeIpv6GatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6GatewayAttributeResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeIpv6GatewayAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeIpv6GatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeIpv6GatewayAttributeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeIpv6GatewayAttributeResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeIpv6GatewayAttributeResponseBody setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    public DescribeIpv6GatewayAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeIpv6GatewayAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIpv6GatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6GatewayAttributeResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeIpv6GatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeIpv6GatewayAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
