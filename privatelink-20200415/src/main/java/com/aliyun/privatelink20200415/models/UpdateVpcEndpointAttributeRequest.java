// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointAttributeRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate a value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check the request without performing the operation. Valid values:
    // 
    // *   **true**: sends a request for check purposes only. If you select this option, the attributes of the endpoint are not modified after the request passes the check. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false**: sends a common request. If the request passes the check, a 2xx HTTP status code is returned, and the operation is performed. This is the default value.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The description of the endpoint.
    // 
    // The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    // The ID of the endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The name of the endpoint.
    // 
    // The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
    @NameInMap("EndpointName")
    public String endpointName;

    // The ID of the region where the endpoint is deployed. You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateVpcEndpointAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointAttributeRequest self = new UpdateVpcEndpointAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVpcEndpointAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVpcEndpointAttributeRequest setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public UpdateVpcEndpointAttributeRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateVpcEndpointAttributeRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public UpdateVpcEndpointAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
