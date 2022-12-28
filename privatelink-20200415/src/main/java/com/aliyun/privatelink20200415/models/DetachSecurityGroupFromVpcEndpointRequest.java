// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DetachSecurityGroupFromVpcEndpointRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request. You can use the client to generate a value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check the request without performing the operation. Valid values:
    // 
    // *   **true**: sends a request for check purpose only. If you select this option, the endpoint is still associated with the security group after the request passes the check. The system checks whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are set. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false** (default): sends a common request. If the request passes the check, the 2xx HTTP status code is returned, and the operation is performed.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the endpoint that you want to disassociate from the security group.
    @NameInMap("EndpointId")
    public String endpointId;

    // The ID of the region to which the endpoint belongs. You can call the [DescribeRegions](~~120468#doc-api-Privatelink-DescribeRegions~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the security group from which you want to disassociate the endpoint.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static DetachSecurityGroupFromVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachSecurityGroupFromVpcEndpointRequest self = new DetachSecurityGroupFromVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DetachSecurityGroupFromVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachSecurityGroupFromVpcEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DetachSecurityGroupFromVpcEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DetachSecurityGroupFromVpcEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachSecurityGroupFromVpcEndpointRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
