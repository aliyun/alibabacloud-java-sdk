// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate a value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check a request without performing the operation. Valid values:
    // 
    // *   **true**: sends a request for check purpose only. If you select this option, the endpoint is not created after the request passes the check. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false** (default): sends a common request. If the request passes the check, the 2xx HTTP status code is returned, and the operation is performed.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The description of the endpoint.
    // 
    // The description must be 2 to 256 characters in length, and cannot start with `http://` or `https://`.
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    // The name of the endpoint.
    // 
    // The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). The name must start with a letter.
    @NameInMap("EndpointName")
    public String endpointName;

    // The type of the endpoint.
    // 
    // Set the value to **Interface**. Then, you can specify Application Load Balancer (ALB) and Classic Load Balancer (CLB) instances as service resources for endpoint services.
    @NameInMap("EndpointType")
    public String endpointType;

    // Specifies whether to enable user authentication. This parameter is available in Security Token Service (STS) mode. Valid values:
    // 
    // *   **true**: enables user authentication. After user authentication is enabled, only the user who creates the endpoint can modify or delete the endpoint in STS mode.
    // *   **false** (default): disables user authentication.
    @NameInMap("ProtectedEnabled")
    public Boolean protectedEnabled;

    // The region ID of the endpoint.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies the ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    // The endpoint service with which the endpoint is associated.
    @NameInMap("ServiceId")
    public String serviceId;

    // The name of the endpoint service with which the endpoint is associated.
    @NameInMap("ServiceName")
    public String serviceName;

    // The list of tags. You can specify a maximum of 20 tags.
    @NameInMap("Tag")
    public java.util.List<CreateVpcEndpointRequestTag> tag;

    // The virtual private cloud (VPC) to which the endpoint belongs.
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Zone")
    public java.util.List<CreateVpcEndpointRequestZone> zone;

    // The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Set the value to **1**.
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

    public CreateVpcEndpointRequest setProtectedEnabled(Boolean protectedEnabled) {
        this.protectedEnabled = protectedEnabled;
        return this;
    }
    public Boolean getProtectedEnabled() {
        return this.protectedEnabled;
    }

    public CreateVpcEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcEndpointRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public CreateVpcEndpointRequest setTag(java.util.List<CreateVpcEndpointRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVpcEndpointRequestTag> getTag() {
        return this.tag;
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

    public static class CreateVpcEndpointRequestTag extends TeaModel {
        // The key of the tag that is attached to the resource.
        // 
        // The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of the tag that is attached to the resource.
        // 
        // The tag values can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
        @NameInMap("Value")
        public String value;

        public static CreateVpcEndpointRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcEndpointRequestTag self = new CreateVpcEndpointRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVpcEndpointRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpcEndpointRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateVpcEndpointRequestZone extends TeaModel {
        // The vSwitch where you want to create the ENI in the zone.
        // 
        // You can specify up to 10 vSwitches.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // The zone of the endpoint service.
        // 
        // You can specify up to 10 zones.
        @NameInMap("ZoneId")
        public String zoneId;

        // The IP address of the zone in which the endpoint is deployed.
        // 
        // You can specify up to 10 IP addresses.
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
