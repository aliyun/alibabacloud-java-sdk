// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBNodesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze450g4ctg6t****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The details of the node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<CreateDBNodesRequestDBNode> DBNode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The resource group ID. You can call the DescribeDBInstanceAttribute operation to query the resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateDBNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBNodesRequest self = new CreateDBNodesRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBNodesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBNodesRequest setDBNode(java.util.List<CreateDBNodesRequestDBNode> DBNode) {
        this.DBNode = DBNode;
        return this;
    }
    public java.util.List<CreateDBNodesRequestDBNode> getDBNode() {
        return this.DBNode;
    }

    public CreateDBNodesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBNodesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBNodesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBNodesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class CreateDBNodesRequestDBNode extends TeaModel {
        /**
         * <p>The specification information of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.medium.xc</p>
         */
        @NameInMap("classCode")
        public String classCode;

        /**
         * <p>The vSwitch ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1sxxsodv28ey5dl****</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        /**
         * <p>The ID of the zone in which the node is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static CreateDBNodesRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            CreateDBNodesRequestDBNode self = new CreateDBNodesRequestDBNode();
            return TeaModel.build(map, self);
        }

        public CreateDBNodesRequestDBNode setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public CreateDBNodesRequestDBNode setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public CreateDBNodesRequestDBNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
