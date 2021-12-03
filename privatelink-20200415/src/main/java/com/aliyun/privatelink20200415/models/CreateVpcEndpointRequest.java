// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EndpointDescription")
    public String endpointDescription;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Zone")
    public java.util.List<CreateVpcEndpointRequestZone> zone;

    @NameInMap("ZonePrivateIpAddressCount")
    public Long zonePrivateIpAddressCount;

    public static CreateVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointRequest self = new CreateVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpcEndpointRequest setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public CreateVpcEndpointRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public CreateVpcEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateVpcEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcEndpointRequest setSecurityGroupId(java.util.List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public java.util.List<String> getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateVpcEndpointRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateVpcEndpointRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateVpcEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVpcEndpointRequest setZone(java.util.List<CreateVpcEndpointRequestZone> zone) {
        this.zone = zone;
        return this;
    }
    public java.util.List<CreateVpcEndpointRequestZone> getZone() {
        return this.zone;
    }

    public CreateVpcEndpointRequest setZonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
        this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
        return this;
    }
    public Long getZonePrivateIpAddressCount() {
        return this.zonePrivateIpAddressCount;
    }

    public static class CreateVpcEndpointRequestZone extends TeaModel {
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ip")
        public String ip;

        public static CreateVpcEndpointRequestZone build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcEndpointRequestZone self = new CreateVpcEndpointRequestZone();
            return TeaModel.build(map, self);
        }

        public CreateVpcEndpointRequestZone setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateVpcEndpointRequestZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public CreateVpcEndpointRequestZone setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
