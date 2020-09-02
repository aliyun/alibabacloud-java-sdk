// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewayAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("BusinessStatus")
    @Validation(required = true)
    public String businessStatus;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("InstanceChargeType")
    @Validation(required = true)
    public String instanceChargeType;

    @NameInMap("ExpiredTime")
    @Validation(required = true)
    public String expiredTime;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    public static DescribeIpv6GatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewayAttributeResponse self = new DescribeIpv6GatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6GatewayAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6GatewayAttributeResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIpv6GatewayAttributeResponse setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    public DescribeIpv6GatewayAttributeResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeIpv6GatewayAttributeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeIpv6GatewayAttributeResponse setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeIpv6GatewayAttributeResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeIpv6GatewayAttributeResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeIpv6GatewayAttributeResponse setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeIpv6GatewayAttributeResponse setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeIpv6GatewayAttributeResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeIpv6GatewayAttributeResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

}
