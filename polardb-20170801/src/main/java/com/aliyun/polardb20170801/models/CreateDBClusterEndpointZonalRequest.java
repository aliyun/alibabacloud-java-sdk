// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointZonalRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    /**
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f******************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBEndpointDescription")
    public String DBEndpointDescription;

    /**
     * <strong>example:</strong>
     * <p>{&quot;ConsistLevel&quot;: &quot;1&quot;,&quot;DistributedTransaction&quot;: &quot;on&quot;}</p>
     */
    @NameInMap("EndpointConfig")
    public String endpointConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <strong>example:</strong>
     * <p>pi-**************,pi-*************</p>
     */
    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PolarSccTimeoutAction")
    public String polarSccTimeoutAction;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PolarSccWaitTimeout")
    public String polarSccWaitTimeout;

    /**
     * <strong>example:</strong>
     * <p>ReadOnly</p>
     */
    @NameInMap("ReadWriteMode")
    public String readWriteMode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SccMode")
    public String sccMode;

    public static CreateDBClusterEndpointZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterEndpointZonalRequest self = new CreateDBClusterEndpointZonalRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterEndpointZonalRequest setAutoAddNewNodes(String autoAddNewNodes) {
        this.autoAddNewNodes = autoAddNewNodes;
        return this;
    }
    public String getAutoAddNewNodes() {
        return this.autoAddNewNodes;
    }

    public CreateDBClusterEndpointZonalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBClusterEndpointZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBClusterEndpointZonalRequest setDBEndpointDescription(String DBEndpointDescription) {
        this.DBEndpointDescription = DBEndpointDescription;
        return this;
    }
    public String getDBEndpointDescription() {
        return this.DBEndpointDescription;
    }

    public CreateDBClusterEndpointZonalRequest setEndpointConfig(String endpointConfig) {
        this.endpointConfig = endpointConfig;
        return this;
    }
    public String getEndpointConfig() {
        return this.endpointConfig;
    }

    public CreateDBClusterEndpointZonalRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateDBClusterEndpointZonalRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public CreateDBClusterEndpointZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBClusterEndpointZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBClusterEndpointZonalRequest setPolarSccTimeoutAction(String polarSccTimeoutAction) {
        this.polarSccTimeoutAction = polarSccTimeoutAction;
        return this;
    }
    public String getPolarSccTimeoutAction() {
        return this.polarSccTimeoutAction;
    }

    public CreateDBClusterEndpointZonalRequest setPolarSccWaitTimeout(String polarSccWaitTimeout) {
        this.polarSccWaitTimeout = polarSccWaitTimeout;
        return this;
    }
    public String getPolarSccWaitTimeout() {
        return this.polarSccWaitTimeout;
    }

    public CreateDBClusterEndpointZonalRequest setReadWriteMode(String readWriteMode) {
        this.readWriteMode = readWriteMode;
        return this;
    }
    public String getReadWriteMode() {
        return this.readWriteMode;
    }

    public CreateDBClusterEndpointZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBClusterEndpointZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBClusterEndpointZonalRequest setSccMode(String sccMode) {
        this.sccMode = sccMode;
        return this;
    }
    public String getSccMode() {
        return this.sccMode;
    }

}
