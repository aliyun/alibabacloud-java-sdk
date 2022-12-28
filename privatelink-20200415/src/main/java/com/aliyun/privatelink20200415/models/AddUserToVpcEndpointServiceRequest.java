// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AddUserToVpcEndpointServiceRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate a value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check the request without performing the operation. Valid values:
    // 
    // *   **true**: sends a request for check purposes only. If you select this option, the account ID is not added to the whitelist after the request passes the check. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false**: sends a common request. If the request passes the check, a 2xx HTTP status code is returned, and the operation is performed. This is the default value.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the region where the endpoint service is deployed. You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    // The whitelist in the format of Aliyun Resource Name (ARN).
    @NameInMap("UserARN")
    public String userARN;

    // The account ID that you want to add to the whitelist.
    @NameInMap("UserId")
    public Long userId;

    public static AddUserToVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToVpcEndpointServiceRequest self = new AddUserToVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddUserToVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddUserToVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddUserToVpcEndpointServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public AddUserToVpcEndpointServiceRequest setUserARN(String userARN) {
        this.userARN = userARN;
        return this;
    }
    public String getUserARN() {
        return this.userARN;
    }

    public AddUserToVpcEndpointServiceRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
