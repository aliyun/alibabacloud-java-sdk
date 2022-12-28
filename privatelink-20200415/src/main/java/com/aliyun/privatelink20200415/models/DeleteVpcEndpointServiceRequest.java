// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DeleteVpcEndpointServiceRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate a value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check a request without performing the operation. Valid values:
    // 
    // *   **true**: sends a request for check purposes only. If you select this option, the endpoint service is not deleted after the request passes the check. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false** (default): sends a common request. If the request passes the check, the 2xx HTTP status code is returned, and the operation is performed.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the region to which the endpoint service belongs. You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the endpoint service that you want to delete.
    @NameInMap("ServiceId")
    public String serviceId;

    public static DeleteVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcEndpointServiceRequest self = new DeleteVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVpcEndpointServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
