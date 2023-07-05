// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DetachSecurityGroupFromVpcEndpointRequest extends TeaModel {
    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: sends a request for check purpose only. If you select this option, the endpoint is still associated with the security group after the request passes the check. The system checks whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are set. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends a common request. If the request passes the check, the 2xx HTTP status code is returned, and the operation is performed.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint that you want to disassociate from the security group.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the security group from which you want to disassociate the endpoint.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>*   **DetachSecurityGroupFromVpcEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListVpcEndpoints](~~183558#doc-api-Privatelink-ListVpcEndpoints~~) operation to query whether the endpoint is disassociated from the security group.</p>
     * <br>
     * <p>    *   If the endpoint is in the **Pending** state, it indicates that the endpoint is being disassociated from the security group.</p>
     * <p>    *   If the endpoint is in the **Active** state, it indicates that the endpoint is disassociated from the security group.</p>
     * <br>
     * <p>*   You cannot use the **DetachSecurityGroupFromVpcEndpoint** operation to disassociate an endpoint from multiple security groups at the same time.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the region to which the endpoint belongs. You can call the [DescribeRegions](~~120468#doc-api-Privatelink-DescribeRegions~~) operation to query the most recent region list.</p>
     */
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
