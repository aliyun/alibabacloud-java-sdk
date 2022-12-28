// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AttachSecurityGroupToVpcEndpointRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request. You can use the client to generate a value that is unique among different requests. **ClientToken** can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to only check the API request. Valid values:
    // 
    // **true**: only checks the API request. If you select this option, the endpoint is not associated with the security group after the request passes the check. Check items include whether the AccessKey pair is valid, whether the RAM user is authorized, and whether the required parameters are specified. If the request fails to meet the requirements in the check items, an error message is returned. If the request meets the requirements in the check items, the `DryRunOperation` error code is returned.
    // 
    // **false** (default): checks the API request. After the request passes the check, the 2XX HTTP status code is returned, and the endpoint is associated with the security group.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the endpoint that you want to associate with the security group.
    @NameInMap("EndpointId")
    public String endpointId;

    // The ID of the region where the endpoint is created. You can call the [DescribeRegions](~~120468~~) operation to query region IDs.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the security group with which you want to associate the endpoint.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static AttachSecurityGroupToVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachSecurityGroupToVpcEndpointRequest self = new AttachSecurityGroupToVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public AttachSecurityGroupToVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachSecurityGroupToVpcEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AttachSecurityGroupToVpcEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public AttachSecurityGroupToVpcEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachSecurityGroupToVpcEndpointRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
