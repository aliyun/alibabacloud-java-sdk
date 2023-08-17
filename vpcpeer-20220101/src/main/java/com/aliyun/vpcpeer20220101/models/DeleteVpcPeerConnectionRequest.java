// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class DeleteVpcPeerConnectionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcefully delete the VPC peering connection. Valid values:</p>
     * <br>
     * <p>*   **false** (default): no.</p>
     * <p>*   **true**: yes. If you forcefully delete the VPC peering connection, the system deletes the routes that point to the VPC peering connection from the VPC route table.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the VPC peering connection that you want to delete.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteVpcPeerConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcPeerConnectionRequest self = new DeleteVpcPeerConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcPeerConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteVpcPeerConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteVpcPeerConnectionRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteVpcPeerConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
