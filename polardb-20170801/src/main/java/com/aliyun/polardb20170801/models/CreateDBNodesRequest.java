// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBNodesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The details of the read-only node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<CreateDBNodesRequestDBNode> DBNode;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li>RO</li>
     * <li>STANDBY</li>
     * <li>DLNode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RO</p>
     */
    @NameInMap("DBNodeType")
    public String DBNodeType;

    /**
     * <p>The ID of the cluster endpoint to which the read-only node is added. If you want to add the read-only node to multiple endpoints at the same time, separate the endpoint IDs with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98205.html">DescribeDBClusterEndpoints</a> operation to query the details of cluster endpoints, including endpoint IDs.</li>
     * <li>You can enter the ID of the default cluster endpoint or a custom cluster endpoint.</li>
     * <li>If you leave this parameter empty, the read-only node is added to all cluster endpoints for which the <strong>Automatically Associate New Nodes</strong> feature is enabled. If you set <code>AutoAddNewNodes</code> to <code>Enable</code>, the Automatically Associate New Nodes feature is enabled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pe-<strong><strong><strong><strong><strong><strong><strong><strong>,pe-</strong></strong></strong></strong></strong></strong></strong></strong></p>
     */
    @NameInMap("EndpointBindList")
    public String endpointBindList;

    /**
     * <p>Specifies whether to enable the In-Memory Column Index (IMCI) feature. Default value: OFF. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong></li>
     * <li><strong>OFF</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is invalid for a PolarDB for Oracle or PolarDB for PostgreSQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("ImciSwitch")
    public String imciSwitch;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latest start time for upgrading the specifications within the scheduled time period. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The value of this parameter must be at least 30 minutes later than the value of PlannedStartTime.</li>
     * <li>If you specify <code>PlannedStartTime</code> but do not specify PlannedEndTime, the latest start time of the task is set to a value that is calculated by using the following formula: <code>PlannedEndTime value + 30 minutes</code>. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and you do not specify PlannedEndTime, the latest start time of the task is set to <code>2021-01-14T09:30:00Z</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest start time of the scheduled task for adding the read-only node. The scheduled task specifies that the task is run in the required period. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The earliest start time of the scheduled task can be a point in time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a point in time between <code>2021-01-14T09:00:00Z</code> and <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If you leave this parameter empty, the task for adding the read-only node is immediately run by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
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
         * <ul>
         * <li>PolarDB for MySQL: <a href="https://help.aliyun.com/document_detail/102542.html">Specifications of compute nodes</a></li>
         * <li>PolarDB for PostgreSQL (Compatible with Oracle): <a href="https://help.aliyun.com/document_detail/207921.html">Specifications of compute nodes</a></li>
         * <li>PolarDB for PostgreSQL: <a href="https://help.aliyun.com/document_detail/209380.html">Specifications of compute nodes</a></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You need to specify either DBNode.N.ZoneId or DBNode.N.TargetClass. N is an integer that starts from 1. The maximum value of N is equal to 16 minus the number of existing nodes.</li>
         * <li>You can add multiple read-only nodes at the same time only to PolarDB for MySQL clusters, which can contain up to of 15 read-only nodes.</li>
         * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.medium</p>
         */
        @NameInMap("TargetClass")
        public String targetClass;

        /**
         * <p>The zone ID of the node that you want to add, which must be the same as the zone ID of existing nodes. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the IDs of zones.</p>
         * <blockquote>
         * <ul>
         * <li>You need to specify either DBNode.N.ZoneId or DBNode.N.TargetClass. N is an integer that starts from 1. The maximum value of N is equal to 16 minus the number of existing nodes.</li>
         * <li>You can add multiple read-only nodes at the same time only to PolarDB for MySQL clusters, which can contain up to of 15 read-only nodes.</li>
         * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao-c</p>
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
