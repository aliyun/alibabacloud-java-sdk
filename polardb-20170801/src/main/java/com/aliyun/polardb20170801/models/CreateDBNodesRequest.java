// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBNodesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The details of the read-only node.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<CreateDBNodesRequestDBNode> DBNode;

    /**
     * <p>The type of the node. Valid values:</p>
     * <br>
     * <p>*   RO</p>
     * <p>*   STANDBY</p>
     * <p>*   DLNode</p>
     */
    @NameInMap("DBNodeType")
    public String DBNodeType;

    /**
     * <p>The ID of the cluster endpoint to which the read-only node is added. If you want to add the read-only node to multiple endpoints at the same time, separate the endpoint IDs with commas (,).</p>
     * <p>> - You can call the [DescribeDBClusterEndpoints](~~98205~~) operation to query the details of cluster endpoints, including endpoint IDs.</p>
     * <p>>- You can enter the ID of the default cluster endpoint or a custom cluster endpoint.</p>
     * <p>>- If you leave this parameter empty, the read-only node is added to all cluster endpoints for which the **Automatically Associate New Nodes** feature is enabled. If you set `AutoAddNewNodes` to `Enable`, the Automatically Associate New Nodes feature is enabled.</p>
     */
    @NameInMap("EndpointBindList")
    public String endpointBindList;

    /**
     * <p>Specifies whether to enable the In-Memory Column Index (IMCI) feature. Default value: OFF. Valid values:</p>
     * <br>
     * <p>*   **ON**</p>
     * <p>*   **OFF**</p>
     * <br>
     * <p>> This parameter is invalid for a PolarDB for Oracle or PolarDB for PostgreSQL cluster.</p>
     */
    @NameInMap("ImciSwitch")
    public String imciSwitch;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latest start time for upgrading the specifications within the scheduled time period. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.</p>
     * <br>
     * <p>>- The value of this parameter must be at least 30 minutes later than the value of PlannedStartTime.</p>
     * <p>>- If you specify `PlannedStartTime` but do not specify PlannedEndTime, the latest start time of the task is set to a value that is calculated by using the following formula: `PlannedEndTime value + 30 minutes`. For example, if you set `PlannedStartTime` to `2021-01-14T09:00:00Z` and you do not specify PlannedEndTime, the latest start time of the task is set to `2021-01-14T09:30:00Z`.</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest start time of the scheduled task for adding the read-only node. The scheduled task specifies that the task is run in the required period. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.</p>
     * <br>
     * <p>>- The earliest start time of the scheduled task can be a point in time within the next 24 hours. For example, if the current time is `2021-01-14T09:00:00Z`, you can specify a point in time between `2021-01-14T09:00:00Z` and `2021-01-15T09:00:00Z`.</p>
     * <p>>- If you leave this parameter empty, the task for adding the read-only node is immediately run by default.</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The ID of the resource group.</p>
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

    public CreateDBNodesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBNodesRequest setDBNode(java.util.List<CreateDBNodesRequestDBNode> DBNode) {
        this.DBNode = DBNode;
        return this;
    }
    public java.util.List<CreateDBNodesRequestDBNode> getDBNode() {
        return this.DBNode;
    }

    public CreateDBNodesRequest setDBNodeType(String DBNodeType) {
        this.DBNodeType = DBNodeType;
        return this;
    }
    public String getDBNodeType() {
        return this.DBNodeType;
    }

    public CreateDBNodesRequest setEndpointBindList(String endpointBindList) {
        this.endpointBindList = endpointBindList;
        return this;
    }
    public String getEndpointBindList() {
        return this.endpointBindList;
    }

    public CreateDBNodesRequest setImciSwitch(String imciSwitch) {
        this.imciSwitch = imciSwitch;
        return this;
    }
    public String getImciSwitch() {
        return this.imciSwitch;
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

    public CreateDBNodesRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public CreateDBNodesRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
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
         * <p>The specifications of the read-only node that you want to add, which must be the same as the specifications of the existing nodes. For more information, see the following topics:</p>
         * <br>
         * <p>*   PolarDB for MySQL: [Specifications of compute nodes](~~102542~~)</p>
         * <p>*   PolarDB for PostgreSQL (Compatible with Oracle): [Specifications of compute nodes](~~207921~~)</p>
         * <p>*   PolarDB for PostgreSQL: [Specifications of compute nodes](~~209380~~)</p>
         * <br>
         * <p>>- You need to specify either DBNode.N.ZoneId or DBNode.N.TargetClass. N is an integer that starts from 1. The maximum value of N is equal to 16 minus the number of existing nodes.</p>
         * <p>>- You can add multiple read-only nodes at the same time only to PolarDB for MySQL clusters, which can contain up to of 15 read-only nodes.</p>
         * <p>>- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</p>
         */
        @NameInMap("TargetClass")
        public String targetClass;

        /**
         * <p>The zone ID of the node that you want to add, which must be the same as the zone ID of existing nodes. You can call the [DescribeRegions](~~98041~~) operation to query the IDs of zones.</p>
         * <br>
         * <p>>- You need to specify either DBNode.N.ZoneId or DBNode.N.TargetClass. N is an integer that starts from 1. The maximum value of N is equal to 16 minus the number of existing nodes.</p>
         * <p>>- You can add multiple read-only nodes at the same time only to PolarDB for MySQL clusters, which can contain up to of 15 read-only nodes.</p>
         * <p>>- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateDBNodesRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            CreateDBNodesRequestDBNode self = new CreateDBNodesRequestDBNode();
            return TeaModel.build(map, self);
        }

        public CreateDBNodesRequestDBNode setTargetClass(String targetClass) {
            this.targetClass = targetClass;
            return this;
        }
        public String getTargetClass() {
            return this.targetClass;
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
