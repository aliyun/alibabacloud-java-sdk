// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class RejectVpcPeerConnectionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the system uses <strong>RequestId</strong> as <strong>ClientToken</strong>. The value of <strong>RequestId</strong> for each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: checks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, an error message is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the VPC peering connection to be rejected by the acceptor VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pcc-lnk0m24khwvtkm0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static RejectVpcPeerConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectVpcPeerConnectionRequest self = new RejectVpcPeerConnectionRequest();
        return TeaModel.build(map, self);
    }

    public RejectVpcPeerConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RejectVpcPeerConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RejectVpcPeerConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RejectVpcPeerConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
