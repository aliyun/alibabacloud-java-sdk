// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class RemoveUserFromVpcEndpointServiceRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request. You can use the client to generate a value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check the request without performing the operation. Valid values:
    // 
    // *   **true**: sends a request for check purpose only. If you select this option, the account ID is not removed from the whitelist after the request passes the check. The system checks whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are set. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false** (default): sends a common request. If the request passes the check, the 2xx HTTP status code is returned, and the operation is performed.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The region ID of the endpoint service for which you want to remove the account ID from the whitelist. You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    // The account ID whitelist in the format of Aliyun Resource Name (ARN).
    @NameInMap("UserARN")
    public String userARN;

    // The account ID that you want to remove from the whitelist.
    @NameInMap("UserId")
    public Long userId;

    public static RemoveUserFromVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromVpcEndpointServiceRequest self = new RemoveUserFromVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveUserFromVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveUserFromVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveUserFromVpcEndpointServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RemoveUserFromVpcEndpointServiceRequest setUserARN(String userARN) {
        this.userARN = userARN;
        return this;
    }
    public String getUserARN() {
        return this.userARN;
    }

    public RemoveUserFromVpcEndpointServiceRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
